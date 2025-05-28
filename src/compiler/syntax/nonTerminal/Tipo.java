package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Clase que representa un tipo en el compilador AdaUNED.
 * Sirve como envoltorio para un objeto TypeIF que puede ser un tipo simple o
 * estructurado.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class Tipo extends NonTerminal {

    /** Objeto que representa el tipo semántico */
    private TypeIF type;

    /** Constructor por defecto */
    public Tipo() {
        super();
    }

    /**
     * Constructor con tipo
     * 
     * @param type tipo semántico
     */
    public Tipo(TypeIF type) {
        super();
        this.type = type;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de Tipo
     */
    public Tipo(Tipo other) {
        super();
        this.type = other.type;
    }

    public TypeIF getType() {
        return type;
    }

    public void setType(TypeIF type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "type=" + (type != null ? type.toString() : "null") +
                '}';
    }
}
