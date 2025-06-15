package compiler.code;

import java.util.Arrays;
import java.util.List;

import compiler.intermediate.Field;
import compiler.intermediate.Label;
import compiler.intermediate.Nemonic;
import compiler.intermediate.Temporal;
import compiler.intermediate.Value;
import compiler.intermediate.Variable;
import compiler.semantic.type.TypeSimple;

import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

/**
 * Class for the ENS2001 Execution environment.
 */

public class ExecutionEnvironmentEns2001
        implements ExecutionEnvironmentIF {
    private final static int MAX_ADDRESS = 65535;
    private final static String[] REGISTERS = {
            ".PC", ".SP", ".SR", ".IX", ".IY", ".A",
            ".R0", ".R1", ".R2", ".R3", ".R4",
            ".R5", ".R6", ".R7", ".R8", ".R9"
    };

    private RegisterDescriptorIF registerDescriptor;
    private MemoryDescriptorIF memoryDescriptor;

    /**
     * Constructor for ENS2001Environment.
     */
    public ExecutionEnvironmentEns2001() {
        super();
    }

    /**
     * Returns the size of the type within the architecture.
     * 
     * @return the size of the type within the architecture.
     */
    @Override
    public final int getTypeSize(TypeSimple type) {
        return 1;
    }

    /**
     * Returns the registers.
     * 
     * @return the registers.
     */
    @Override
    public final List<String> getRegisters() {
        return Arrays.asList(REGISTERS);
    }

    /**
     * Returns the memory size.
     * 
     * @return the memory size.
     */
    @Override
    public final int getMemorySize() {
        return MAX_ADDRESS;
    }

    /**
     * Returns the registerDescriptor.
     * 
     * @return Returns the registerDescriptor.
     */
    @Override
    public final RegisterDescriptorIF getRegisterDescriptor() {
        return registerDescriptor;
    }

    /**
     * Returns the memoryDescriptor.
     * 
     * @return Returns the memoryDescriptor.
     */
    @Override
    public final MemoryDescriptorIF getMemoryDescriptor() {
        return memoryDescriptor;
    }

    /**
     * Translate a quadruple into a set of final code instructions.
     * 
     * @param cuadruple The quadruple to be translated.
     * @return a quadruple into a set of final code instructions.
     */
    @Override
    public final String translate(QuadrupleIF q) {
        String op = q.getOperation();
        OperandIF res = q.getResult();
        OperandIF op1 = q.getFirstOperand();
        OperandIF op2 = q.getSecondOperand();

        String comment = "; " + q.toString() + "\n";
        String translation = translateOperation(op, res, op1, op2);

        return comment + translation;
    }

    private String translateOperation(String op, OperandIF res, OperandIF op1, OperandIF op2) {
        switch (op) {
            case Nemonic.VARGLOBAL:
                return translateVarGlobal(res, op1);
            case Nemonic.CONSTANT:
                return translateConstant(res, op1);
            case Nemonic.CADENA:
                return translateCadena(res, op1);
            case Nemonic.AND:
                return translateAnd(res, op1, op2);
            case Nemonic.BR:
                return translateBr(res);
            case Nemonic.BRF:
                return translateBrf(op1, res);
            case Nemonic.CALL:
                return translateCall(op1);
            case Nemonic.HALT:
                return translateHalt();
            case Nemonic.INIT:
                return translateInit();
            case Nemonic.INL:
                return translateInl(res);
            case Nemonic.SUB:
                return translateSub(res, op1, op2);
            case Nemonic.MUL:
                return translateMul(res, op1, op2);
            case Nemonic.MV:
                return translateMv(res, op1);
            case Nemonic.MVR:
                return translateMvr(res, op1);
            case Nemonic.NEQ:
                return translateNeq(res, op1, op2);
            case Nemonic.GR:
                return translateGr(res, op1, op2);
            case Nemonic.WRSTR:
                return translateWrstr(op1);
            case Nemonic.WRINT:
                return translateWrint(res);
            case Nemonic.TYPE_USED:
                return translateTypeUsed(op1);
            case Nemonic.MOVE:
                return translateMv(res, op1);
            case Nemonic.DECL:
                return translateDecl(op1);
            case Nemonic.ACCESO:
                return translateAcceso(res, op1);
            default:
                return "??\n";
        }
    }

    private String translateAcceso(OperandIF res, OperandIF op1) {
        if (op1 instanceof Field) {
            Field field = (Field) op1;
            StringBuilder code = new StringBuilder();
            code.append("; ACCESO al campo ").append(field.getCampo())
                    .append(" del registro ").append(field.getRegistro().getName())
                    .append(" --> reserva espacio para el campo\n");
            code.append("MOVE ").append(getAddress(op1)).append(", ").append(getAddress(res)).append("\n");
            return code.toString();
        } else {
            return "; ACCESO DESCONOCIDO\n";
        }
    }

    private String translateConstant(OperandIF res, OperandIF op1) {
        StringBuilder code = new StringBuilder();
        if (op1 instanceof Value) {
            code.append("; CONSTANTE ").append(res.toString()).append(" con valor: ").append(op1.toString())
                    .append(" --> reserva espacio para la constante\n");
            code.append("MOVE ").append(getAddress(op1)).append(", ").append(getAddress(res)).append("\n");
        } else {
            code.append("; CONSTANTE DESCONOCIDA\n");
        }
        return code.toString();
    }

    private String translateCadena(OperandIF res, OperandIF op1) {
        StringBuilder code = new StringBuilder();
        code.append(op1.toString()).append(" : DATA ").append("\"").append(res.toString()).append("\"\n");

        return code.toString();
    }

    private String translateVarGlobal(OperandIF res, OperandIF op1) {
        StringBuilder code = new StringBuilder();
        code.append("; DECLARACION GLOBAL ").append(((Variable) res).getName()).append(" --> reserva espacio global\n");
        code.append("MOVE ").append(getAddress(op1)).append(", ").append(getAddress(res)).append("\n");

        return code.toString();
    }

    private String translateDecl(OperandIF op1) {
        return "; DECL " + getAddress(op1) + " --> reserva espacio\n";
    }

    private String translateTypeUsed(OperandIF op1) {
        return "; TIPO USADO: " + op1.toString() + "\n";
    }

    private String translateWrint(OperandIF op1) {
        StringBuilder code = new StringBuilder();

        // Instrucción ENS2001 para escribir un entero (el contenido de A)
        code.append("WRINT " + getAddress(op1) + "\n");

        return code.toString();
    }

    private String translateWrstr(OperandIF op1) {
        return "WRSTR /" + op1.toString() + "\n";
    }

    private String translateGr(OperandIF res, OperandIF op1, OperandIF op2) {
        StringBuilder code = new StringBuilder();

        String labelEnd = getNewLabel("GR_END");

        // comparar op1 y op2
        code.append("CMP ")
                .append(getAddress(op1)).append(", ").append(getAddress(op2)).append("\n");

        // res = 0
        code.append("MOVE #0, ").append(getAddress(res)).append("\n");

        // si op1 <= op2, saltar a GR_TRUE
        code.append("BN $").append(labelEnd).append("\n");
        code.append("BZ $").append(labelEnd).append("\n");

        // res = true
        code.append("MOVE #1, ").append(getAddress(res)).append("\n");

        // etiqueta: GR_END
        code.append(labelEnd).append(" :\n");

        return code.toString();
    }

    private String translateNeq(OperandIF res, OperandIF op1, OperandIF op2) {
        StringBuilder code = new StringBuilder();

        String labelTrue = getNewLabel("NEQ_TRUE");
        String labelEnd = getNewLabel("NEQ_END");

        // comparar op1 y op2
        code.append("CMP ")
                .append(getAddress(op1)).append(", ").append(getAddress(op2)).append("\n");

        // res = 0
        code.append("MOVE #0, ").append(getAddress(res)).append("\n");

        // si temp ≠ 0, saltar a NEQ_TRUE
        code.append("BNZ $").append(labelTrue).append("\n");

        // salto incondicional al final
        code.append("BR $").append(labelEnd).append("\n");

        // etiqueta: NEQ_TRUE
        code.append(labelTrue).append(" :\n");

        // res = 1
        code.append("MOVE #1, ").append(getAddress(res)).append("\n");

        // etiqueta: NEQ_END
        code.append(labelEnd).append(" :\n");

        return code.toString();
    }

    private int labelCounter = 0;

    private String getNewLabel(String base) {
        return base + "_" + (labelCounter++);
    }

    private String translateAnd(OperandIF res, OperandIF op1, OperandIF op2) {
        StringBuilder code = new StringBuilder();

        String labelEnd = getNewLabel("AND_END");

        // Inicializa res a 0
        code.append("MOVE #0, ").append(getAddress(res)).append("\n");

        // Compara op1 y op2
        code.append("CMP ").append(getAddress(op1)).append(", #0\n");
        code.append("BZ $").append(labelEnd).append("\n"); // Si op1 es 0, salta al final

        code.append("CMP ").append(getAddress(op2)).append(", #0\n");
        code.append("BZ $").append(labelEnd).append("\n"); // Si op2 es 0, salta al final

        // Si ambos son distintos de 0, res = 1
        code.append("MOVE #1, ").append(getAddress(res)).append("\n");

        // Etiqueta final
        code.append(labelEnd).append(" :\n");

        return code.toString();
    }

    private String translateBr(OperandIF label) {
        return "BR $" + label.toString() + "\n"; // Salto incondicional a la etiqueta
    }

    private String translateBrf(OperandIF label, OperandIF condition) {
        return "CMP " + getAddress(condition) + ", #0\n" + // A := condición (Boolean)
                "BZ $" + label.toString() + "\n"; // Si A == 0 (false), salta
    }

    private String translateCall(OperandIF function) {
        return "CALL " + function.toString() + "\n"; // Llama a la función
    }

    private String translateInit() {
        return "; Inicio del programa\n";
    }

    private String translateHalt() {
        return "HALT\n"; // Fin del programa
    }

    private String translateInl(OperandIF label) {
        return label.toString() + ":\n";
    }

    private String translateSub(OperandIF res, OperandIF op1, OperandIF op2) {
        StringBuilder code = new StringBuilder();

        // Realiza la resta op1 - op2 y deja el resultado en .A
        code.append("SUB ").append(getAddress(op1)).append(", ").append(getAddress(op2)).append("\n");

        // Mueve el resultado desde .A a la dirección del resultado
        code.append("MOVE .A, ").append(getAddress(res)).append("\n");

        return code.toString();
    }

    private String translateMul(OperandIF res, OperandIF op1, OperandIF op2) {
        StringBuilder code = new StringBuilder();

        // Multiplica op1 * op2 y deja el resultado en .A
        code.append("MUL ").append(getAddress(op1)).append(", ").append(getAddress(op2)).append("\n");

        // Mueve el resultado de .A al operando de resultado
        code.append("MOVE .A, ").append(getAddress(res)).append("\n");

        return code.toString();
    }

    private String translateMv(OperandIF res, OperandIF value) {
        return "MOVE " + getAddress(value) + ", " + getAddress(res) + "\n"; // Mueve el valor a la dirección de
                                                                            // resultado
    }

    private String translateMvr(OperandIF res, OperandIF y) {
        if (y instanceof Field) {
            Field field = (Field) y;
            String direccionBase = getAddress(field.getRegistro());
            String campo = field.getCampo();
            return "MOVE " + direccionBase + "." + campo + ", " + getAddress(res) + "\n"; // Mueve el campo del registro
        }

        return "";
    }

    private String getAddress(OperandIF operand) {
        if (operand instanceof Variable) {
            Variable var = (Variable) operand;
            return "/" + var.getAddress();
        } else if (operand instanceof Temporal) {
            Temporal temp = (Temporal) operand;
            return "/" + temp.getAddress();
        } else if (operand instanceof Value) {
            Value val = (Value) operand;
            return "#" + val.getValue();
        } else if (operand instanceof Label) {
            return operand.toString();
        } else if (operand instanceof Field) {
            Field field = (Field) operand;
            return "/" + field.getAddress();
        }
        return "#0"; // Valor por defecto si no se reconoce el tipo de operando (funciones)
    }

}
