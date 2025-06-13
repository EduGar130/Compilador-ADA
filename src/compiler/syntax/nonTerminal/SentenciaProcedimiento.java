package compiler.syntax.nonTerminal;

import compiler.semantic.symbol.SymbolProcedure;

/**
 * Clase que representa una llamada a un procedimiento en el compilador AdaUNED.
 * Contiene el símbolo del procedimiento y una lista de temporales para los
 * parámetros.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class SentenciaProcedimiento extends Sentencia {

    private ExprFuncion funcion;
    private SymbolProcedure procedimiento;

    public SentenciaProcedimiento() {
        super();
    }

    public ExprFuncion getFuncion() {
        return funcion;
    }

    public void setFuncion(ExprFuncion funcion) {
        this.funcion = funcion;
    }

    public SymbolProcedure getProcedure() {
        return procedimiento;
    }

    public void setProcedure(SymbolProcedure procedimiento) {
        this.procedimiento = procedimiento;
    }

    @Override
    public String toString() {
        return "SentenciaProcedimiento{" +
                "funcion=" + (funcion != null ? funcion.toString() : "null") +
                '}';
    }
}
