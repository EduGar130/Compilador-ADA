package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un bloque de sentencias en el compilador AdaUNED.
 * Contiene una lista de objetos Sentencia (abstractos o concretos).
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class Sentencias extends NonTerminal {

    /** Lista de sentencias del bloque */
    private List<Sentencia> sentencias;

    /** Constructor por defecto */
    public Sentencias() {
        super();
        this.sentencias = new ArrayList<>();
    }

    /**
     * Constructor con lista de sentencias
     * 
     * @param sentencias lista de sentencias
     */
    public Sentencias(List<Sentencia> sentencias) {
        super();
        this.sentencias = sentencias;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de Sentencias
     */
    public Sentencias(Sentencias other) {
        super();
        this.sentencias = new ArrayList<>(other.sentencias);
    }

    public List<Sentencia> getSentencias() {
        return sentencias;
    }

    public void setSentencias(List<Sentencia> sentencias) {
        this.sentencias = sentencias;
    }

    /**
     * Añade una sentencia a la lista
     * 
     * @param sentencia sentencia a añadir
     */
    public void addSentencia(Sentencia sentencia) {
        this.sentencias.add(sentencia);
    }
}
