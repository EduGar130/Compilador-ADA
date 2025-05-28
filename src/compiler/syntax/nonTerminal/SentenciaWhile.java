package compiler.syntax.nonTerminal;

/**
 * Clase que representa una sentencia de bucle WHILE en el compilador AdaUNED.
 * Contiene el temporal asociado a la condición evaluada.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */

public class SentenciaWhile extends Sentencia {

    private Expresion condicion;
    private Sentencias cuerpo;

    public SentenciaWhile() {
        super();
    }

    public Expresion getCondicion() {
        return condicion;
    }

    public void setCondicion(Expresion condicion) {
        this.condicion = condicion;
    }

    public Sentencias getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Sentencias cuerpo) {
        this.cuerpo = cuerpo;
    }
}
