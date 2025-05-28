package compiler.syntax.nonTerminal;

/**
 * Clase que representa el cuerpo de una función en el compilador AdaUNED.
 * Contiene las declaraciones locales y las sentencias del bloque.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class CuerpoFunction extends NonTerminal {

    /** Declaraciones locales dentro del cuerpo de la función */
    private DeclaracionesFunction declaraciones;

    /** Bloque de sentencias */
    private Sentencias sentencias;

    /** Constructor por defecto */
    public CuerpoFunction() {
        super();
    }

    /**
     * Constructor con declaraciones y sentencias
     * 
     * @param declaraciones declaraciones locales
     * @param sentencias    sentencias ejecutables
     */
    public CuerpoFunction(DeclaracionesFunction declaraciones, Sentencias sentencias) {
        super();
        this.declaraciones = declaraciones;
        this.sentencias = sentencias;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de CuerpoFunction
     */
    public CuerpoFunction(CuerpoFunction other) {
        super();
        this.declaraciones = other.declaraciones;
        this.sentencias = other.sentencias;
    }

    public DeclaracionesFunction getDeclaraciones() {
        return declaraciones;
    }

    public void setDeclaraciones(DeclaracionesFunction declaraciones) {
        this.declaraciones = declaraciones;
    }

    public Sentencias getSentencias() {
        return sentencias;
    }

    public void setSentencias(Sentencias sentencias) {
        this.sentencias = sentencias;
    }
}
