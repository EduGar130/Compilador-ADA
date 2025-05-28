package compiler.syntax.nonTerminal;

/**
 * Clase que representa el axioma del compilador AdaUNED.
 * Es el nodo raíz de la gramática, y contiene el programa completo.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class Axiom extends NonTerminal {

    /** Programa completo representado por el axioma */
    private Program program;

    /** Constructor por defecto */
    public Axiom() {
        super();
    }

    /**
     * Constructor con programa
     * 
     * @param program programa completo
     */
    public Axiom(Program program) {
        super();
        this.program = program;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de Axiom
     */
    public Axiom(Axiom other) {
        super();
        this.program = other.program;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Axiom{" +
                "program=" + (program != null ? program.toString() : "null") +
                '}';
    }
}
