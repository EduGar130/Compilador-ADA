package compiler.syntax.nonTerminal;

import compiler.intermediate.Variable;
import compiler.semantic.symbol.SymbolVariable;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

import java.util.List;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;
import es.uned.lsi.compiler.intermediate.TemporalIF;

/**
 * Clase que representa una referencia a una entidad declarada en el compilador
 * AdaUNED.
 * Puede hacer referencia a variables, constantes, campos, parámetros, etc.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.1
 */
public class Ref extends NonTerminal {

    /** Símbolo referenciado (resuelto en la tabla de símbolos) */
    private SymbolIF symbol;

    /** Tipo de la referencia */
    private TypeIF type;

    /** Temporal asociado si se ha generado */
    private TemporalIF temporal;

    /** Código intermedio asociado a la referencia */
    private List<QuadrupleIF> intermediateCode;

    /** Constructor por defecto */
    public Ref() {
        super();
    }

    public Ref(SymbolIF symbol, TypeIF type) {
        super();
        this.symbol = symbol;
        this.type = type;
    }

    public Ref(Ref other) {
        super();
        this.symbol = other.symbol;
        this.type = other.type;
        this.temporal = other.temporal;
        this.intermediateCode = other.intermediateCode;
    }

    public SymbolIF getSymbol() {
        return symbol;
    }

    public void setSymbol(SymbolIF symbol) {
        this.symbol = symbol;
    }

    public TypeIF getType() {
        return type;
    }

    public void setType(TypeIF type) {
        this.type = type;
    }

    public TemporalIF getTemporal() {
        return temporal;
    }

    public void setTemporal(TemporalIF temporal) {
        this.temporal = temporal;
    }

    public List<QuadrupleIF> getIntermediateCode() {
        return intermediateCode;
    }

    public void setIntermediateCode(List<QuadrupleIF> intermediateCode) {
        this.intermediateCode = intermediateCode;
    }

    /**
     * Devuelve la Variable intermedia asociada a la referencia si es una variable.
     * 
     * @return Variable intermedia para usar en código intermedio
     * @throws IllegalStateException si el símbolo no es una variable
     */
    public Variable getVariable() {
        if (symbol instanceof SymbolVariable) {
            return new Variable(symbol.getName(), symbol.getScope());
        } else {
            throw new IllegalStateException("La referencia '" + symbol.getName() + "' no es una variable.");
        }
    }

    @Override
    public String toString() {
        return "Ref{" +
                "symbol=" + (symbol != null ? symbol.toString() : "null") +
                ", type=" + (type != null ? type.toString() : "null") +
                ", temporal=" + (temporal != null ? temporal.toString() : "null") +
                ", intermediateCode=" + (intermediateCode != null ? intermediateCode.toString() : "null") +
                '}';
    }
}