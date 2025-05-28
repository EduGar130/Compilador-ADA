package compiler.syntax.nonTerminal;

import compiler.semantic.symbol.SymbolFunction;
import es.uned.lsi.compiler.intermediate.TemporalIF;

import java.util.List;

/**
 * Clase que representa una invocación a función en el compilador AdaUNED.
 * Contiene el símbolo de la función, la lista de parámetros y el temporal que
 * almacena el resultado.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class ExprFuncion extends NonTerminal {

    /** Símbolo de la función invocada */
    private SymbolFunction symbol;

    /** Lista de temporales de los parámetros evaluados */
    private List<TemporalIF> parametros;

    /** Temporal donde se almacena el resultado de la función */
    private TemporalIF temporal;

    /** Función asociada a la invocación */
    private SymbolFunction funcion;

    /** Constructor por defecto */
    public ExprFuncion() {
        super();
    }

    /**
     * Constructor con símbolo, parámetros y resultado
     * 
     * @param symbol     símbolo de la función
     * @param parametros lista de temporales
     * @param resultado  temporal del resultado
     */
    public ExprFuncion(SymbolFunction symbol, List<TemporalIF> parametros, TemporalIF resultado) {
        super();
        this.symbol = symbol;
        this.parametros = parametros;
        this.temporal = resultado;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de ExprFuncion
     */
    public ExprFuncion(ExprFuncion other) {
        super();
        this.symbol = other.symbol;
        this.parametros = other.parametros;
        this.temporal = other.temporal;
    }

    public SymbolFunction getSymbol() {
        return symbol;
    }

    public void setSymbol(SymbolFunction symbol) {
        this.symbol = symbol;
    }

    public List<TemporalIF> getParametros() {
        return parametros;
    }

    public void setParametros(List<TemporalIF> parametros) {
        this.parametros = parametros;
    }

    public TemporalIF getTemporal() {
        return temporal;
    }

    public void setTemporal(TemporalIF resultado) {
        this.temporal = resultado;
    }

    public SymbolFunction getFuncion() {
        return funcion;
    }

    public void setFuncion(SymbolFunction funcion) {
        this.funcion = funcion;
    }
}
