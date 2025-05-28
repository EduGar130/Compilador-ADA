package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import compiler.semantic.symbol.SymbolConstant;

/**
 * Clase que representa una declaración de constante en el compilador AdaUNED.
 * Contiene el símbolo y el tipo asociado a la constante declarada.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class DeclConstantes extends NonTerminal {

    /** Símbolo de la constante */
    private SymbolConstant symbol;

    /** Constructor por defecto */
    public DeclConstantes() {
        super();
    }

    /**
     * Constructor con parámetros
     * 
     * @param symbol símbolo de la constante
     * @param type   tipo de la constante
     */
    public DeclConstantes(SymbolConstant symbol) {
        super();
        this.symbol = symbol;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de DeclConstantes
     */
    public DeclConstantes(DeclConstantes other) {
        super();
        this.symbol = other.symbol;
    }

    public SymbolConstant getSymbol() {
        return symbol;
    }

    public void setSymbol(SymbolConstant symbol) {
        this.symbol = symbol;
    }

    private List<Constante> constantes = new ArrayList<>();

    public void addConstante(Constante c) {
        constantes.add(c);
    }

    public List<Constante> getConstantes() {
        return constantes;
    }

    @Override
    public String toString() {
        return "DeclConstantes{" +
                "symbol=" + (symbol != null ? symbol.toString() : "null") +
                ", constantes=" + (constantes != null ? constantes.toString() : "null") +
                '}';
    }
}
