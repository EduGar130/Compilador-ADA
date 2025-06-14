package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;
import es.uned.lsi.compiler.intermediate.TemporalIF;

/**
 * Clase que representa un operando en una expresión del compilador AdaUNED.
 * Puede ser una variable, literal, constante, llamada a función, etc.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class Operando extends NonTerminal {

    /** Tipo del operando */
    private TypeIF type;

    /** Temporal que contiene el valor del operando */
    private TemporalIF temp;

    /** Indica si el operando es código muerto (dead code) */
    private boolean isDeadCode;

    /** Constructor por defecto */
    public Operando() {
        super();
    }

    /**
     * Constructor con tipo y temporal
     * 
     * @param type tipo del operando
     * @param temp temporal que almacena su valor
     */
    public Operando(TypeIF type, TemporalIF temp) {
        super();
        this.type = type;
        this.temp = temp;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de Operando
     */
    public Operando(Operando other) {
        super();
        this.type = other.type;
        this.temp = other.temp;
    }

    public TypeIF getType() {
        return type;
    }

    public void setType(TypeIF type) {
        this.type = type;
    }

    public TemporalIF getTemporal() {
        return temp;
    }

    public void setTemporal(TemporalIF temp) {
        this.temp = temp;
    }

    public boolean isDeadCode() {
        return isDeadCode;
    }

    public void setDeadCode(boolean deadCode) {
        isDeadCode = deadCode;
    }

    @Override
    public String toString() {
        return "Operando{" +
                "type=" + (type != null ? type.toString() : "null") +
                ", temp=" + (temp != null ? temp.toString() : "null") +
                '}';
    }
}
