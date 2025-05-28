package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.symbol.SymbolIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Clase que representa una referencia a una entidad declarada en el compilador
 * AdaUNED.
 * Puede hacer referencia a variables, constantes, campos, parámetros, etc.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class Ref extends NonTerminal {

    /** Símbolo referenciado (resuelto en la tabla de símbolos) */
    private SymbolIF symbol;

    /** Tipo de la referencia */
    private TypeIF type;

    /** Constructor por defecto */
    public Ref() {
        super();
    }

    /**
     * Constructor con símbolo y tipo
     * 
     * @param symbol símbolo referenciado
     * @param type   tipo de la referencia
     */
    public Ref(SymbolIF symbol, TypeIF type) {
        super();
        this.symbol = symbol;
        this.type = type;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de Ref
     */
    public Ref(Ref other) {
        super();
        this.symbol = other.symbol;
        this.type = other.type;
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

    @Override
    public String toString() {
        return "Ref{" +
                "symbol=" + (symbol != null ? symbol.toString() : "null") +
                ", type=" + (type != null ? type.toString() : "null") +
                '}';
    }
}
