package compiler.syntax.nonTerminal;

/**
 * Clase que representa el cuerpo principal del programa AdaUNED.
 * Contiene el bloque de sentencias ejecutables.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class Cuerpo extends NonTerminal {

    /** Bloque de sentencias del cuerpo principal */
    private Sentencias sentencias;

    /** Constructor por defecto */
    public Cuerpo() {
        super();
    }

    /**
     * Constructor con sentencias
     * 
     * @param sentencias bloque de sentencias ejecutables
     */
    public Cuerpo(Sentencias sentencias) {
        super();
        this.sentencias = sentencias;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de Cuerpo
     */
    public Cuerpo(Cuerpo other) {
        super();
        this.sentencias = other.sentencias;
    }

    public Sentencias getSentencias() {
        return sentencias;
    }

    public void setSentencias(Sentencias sentencias) {
        this.sentencias = sentencias;
    }

    @Override
    public String toString() {
        return "Cuerpo{" +
                "sentencias=" + (sentencias != null ? sentencias.toString() : "null") +
                '}';
    }
}
