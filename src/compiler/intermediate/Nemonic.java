package compiler.intermediate;

/**
 * @author Eduardo García Romera
 *
 */
public class Nemonic {
    public final static String ADD = "ADD"; // ADD x y z --> x := y + z (suma)
    public final static String AND = "AND"; // AND x y z --> x := y && z (conjunción)
    public final static String BR = "BR"; // BR L --> Saltar a L (salto incondicional)
    public final static String BRT = "BRT"; // BRT x L --> Si x, saltar a L (salto condicional)
    public final static String BRF = "BRF"; // BRF x L --> Si !x, saltar a L (salto condicional negado)
    public final static String CALL = "CALL"; // CALL f --> Llama a la función f (llamada a función)
    public final static String DIS = "DIS"; // DIS x y z --> x := (y != z)? 1 : 0 (distinto)
    public final static String HALT = "HALT"; // HALT --> Stop (fin de programa)
    public final static String INIT = "INIT"; // INIT --> Inicialización (inicio de programa)
    public final static String INL = "INL"; // INL L --> Insertar L: en la tabla de etiquetas (etiqueta)
    public final static String SUB = "SUB"; // SUB x y z --> x := y - z (resta)
    public final static String LS = "LS"; // LS x y z --> (y < z)? 1 : 0 (menor o igual)
    public final static String MUL = "MUL"; // MUL x y z --> x := y * z (multiplicacin)
    public final static String MV = "MV"; // MV x y --> x := y (asignación)
    public final static String MVA = "MVA"; // MVA x y --> x := &y (dirección)
    public final static String MVP = "MVP"; // MVP x y --> x := *y (indirección)
    public final static String XOR = "XOR"; // XOR x y z --> x := y ^ z (disyunción exclusiva)
    public final static String NOP = "NOP"; // NOP --> Nada (no operación)
    public final static String PARAM = "PARAM"; // PARAM T n --> T: temporal, n: indicador de parmetro procesador
    public final static String PUTL = "PUTL"; // PUTL P --> P: parmetro (paso de parmetros)
    public final static String PUSH = "PUSH"; // PUSH x --> *SP := x ; SP++ (apilamiento)
    public final static String POP = "POP"; // POP x --> x := *SP ; SP-- (desapilamiento)
    public final static String RET = "RET"; // RET x --> Retorno de f con valor x
    public final static String STP = "STP"; // STP x y --> *x := y (almacenamiento)
    public final static String STA = "STA"; // STA x y --> *x := &y (almacenamiento de direccin)
    public final static String RVFUNCT = "RVFUNCT"; // RVFUNCT x --> Almacena en x el valor tomado del Campo de Retorno
                                                    // del registro de activacin actual.
    public final static String EQ = "EQ"; // EQ x y z --> x := (y == z) (igualdad)
    public final static String LT = "LT"; // LT x y z --> x := (y < z) (menor)
    public final static String INC = "INC"; // INC x --> x := x + 1 (autoincremento)
    public final static String NOT = "NOT"; // NOT x y --> x := !y (negación lógica)
    public final static String MOD = "MOD"; // MOD x y z --> x := y % z (módulo)
    public final static String NEG = "NEG"; // NEG x y --> x := -y (negación aritmética)
    public final static String DEC = "DEC"; // DEC x --> x := x - 1 (autodecremento)
    public final static String OR = "OR"; // OR x y z --> x := y || z (disyunción)
    public final static String GR = "GR"; // GR x y z --> x := (y > z) (mayor)
    public final static String DIV = "DIV"; // DIV x y z --> x := y / z (división)
    public final static String BEQ = "BEQ"; // BEQ etiqueta registro1 registro2 --> Salta a 'etiqueta' si registro1 es
                                            // igual a registro2 (branch equal)
    public final static String BNE = "BNE"; // BNE etiqueta registro1 registro2 --> Salta a 'etiqueta' si registro1 no
                                            // es igual a registro2 (branch not equal)
    public final static String WRSTR = "WRSTR"; // WRSTR s --> Escribe el String s por pantalla (write string)
    public final static String WRINT = "WRINT"; // WRINT n --> Escribe el entero n por pantalla (write integer)
}