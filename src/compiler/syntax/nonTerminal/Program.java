package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

/**
 * Clase que representa el programa completo en el compilador AdaUNED.
 * Incluye declaraciones y el cuerpo principal (bloque de ejecución).
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class Program extends NonTerminal {

    /** Declaraciones del programa */
    private Declaraciones declaraciones;

    /** Cuerpo principal del programa */
    private Cuerpo cuerpo;

    /** Constructor por defecto */
    public Program() {
        super();
    }

    /**
     * Constructor con declaraciones y cuerpo
     * 
     * @param declaraciones declaraciones del programa
     * @param cuerpo        bloque principal
     */
    public Program(Declaraciones declaraciones, Cuerpo cuerpo) {
        super();
        this.declaraciones = declaraciones;
        this.cuerpo = cuerpo;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de Program
     */
    public Program(Program other) {
        super();
        this.declaraciones = other.declaraciones;
        this.cuerpo = other.cuerpo;
    }

    public Declaraciones getDeclaraciones() {
        return declaraciones;
    }

    public void setDeclaraciones(Declaraciones declaraciones) {
        this.declaraciones = declaraciones;
    }

    public Cuerpo getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Cuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }

    /**
     * Obtiene el código intermedio completo del programa
     * 
     * @return Lista de cuádruplas (QuadrupleIF)
     */
    public List<QuadrupleIF> getIntermediateCode() {
        List<QuadrupleIF> code = new ArrayList<>();

        if (declaraciones != null) {
            List<QuadrupleIF> codeDecl = declaraciones.getIntermediateCode();
            if (codeDecl != null) {
                code.addAll(codeDecl);
            }
        }

        if (cuerpo != null) {
            List<QuadrupleIF> codeCuerpo = cuerpo.getIntermediateCode();
            if (codeCuerpo != null) {
                code.addAll(codeCuerpo);
            }
        }

        return code;
    }
}
