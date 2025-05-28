package compiler.syntax.nonTerminal;

/**
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */

/**
 * Clase para representar un parámetro de PUT_LINE (expresión o cadena).
 */

public class Parametro extends NonTerminal {

    private boolean esCadena;
    private String cadena;
    private Expresion expresion;

    /** Constructor vacío (para reglas donde se crea vacío) */
    public Parametro() {
        super();
    }

    /** Constructor para cadena */
    public Parametro(String cadena) {
        super();
        this.esCadena = true;
        this.cadena = cadena;
    }

    /** Constructor para expresión */
    public Parametro(Expresion expresion) {
        super();
        this.esCadena = false;
        this.expresion = expresion;
    }

    public boolean esCadena() {
        return esCadena;
    }

    public String getCadena() {
        return cadena;
    }

    public Expresion getExpresion() {
        return expresion;
    }

    @Override
    public String toString() {
        return "Parametro{" +
                "esCadena=" + esCadena +
                ", cadena='" + (cadena != null ? cadena : "null") + '\'' +
                ", expresion=" + (expresion != null ? expresion.toString() : "null") +
                '}';
    }
}
