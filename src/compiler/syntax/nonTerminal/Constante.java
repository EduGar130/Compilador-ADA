package compiler.syntax.nonTerminal;

import compiler.semantic.symbol.SymbolConstant;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Clase que representa una constante simbólica en el compilador AdaUNED.
 * Contiene el símbolo y el tipo de la constante.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class Constante extends NonTerminal {

    /** Símbolo de la constante */
    private SymbolConstant symbol;

    /** Tipo de la constante */
    private TypeIF type;

    /** Constructor por defecto */
    public Constante() {
        super();
    }

    /**
     * Constructor con parámetros
     * 
     * @param symbol símbolo de la constante
     * @param type   tipo de la constante
     */
    public Constante(SymbolConstant symbol, TypeIF type) {
        super();
        this.symbol = symbol;
        this.type = type;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de Constante
     */
    public Constante(Constante other) {
        super();
        this.symbol = other.symbol;
        this.type = other.type;
    }

    public SymbolConstant getSymbol() {
        return symbol;
    }

    public void setSymbol(SymbolConstant symbol) {
        this.symbol = symbol;
    }

    public TypeIF getType() {
        return type;
    }

    public void setType(TypeIF type) {
        this.type = type;
    }
}
