package compiler.syntax.nonTerminal;

/**
 * Clase que representa una declaración genérica de subprograma (función o
 * procedimiento).
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */

public class DeclSubprograma extends NonTerminal {

    private DeclFunction function;
    private DeclProcedimiento procedimiento;

    public void setFunction(DeclFunction function) {
        this.function = function;
    }

    public void setProcedimiento(DeclProcedimiento procedimiento) {
        this.procedimiento = procedimiento;
    }

    public DeclFunction getFunction() {
        return function;
    }

    public DeclProcedimiento getProcedimiento() {
        return procedimiento;
    }
}
