package compiler.syntax.nonTerminal;

/**
 * Clase que representa una sentencia RETURN en el compilador AdaUNED.
 * Contiene el temporal del valor devuelto y su tipo.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */

public class SentenciaReturn extends Sentencia {

    private Expresion expresion;

    public SentenciaReturn() {
        super();
    }

    public Expresion getExpresion() {
        return expresion;
    }

    public void setExpresion(Expresion expresion) {
        this.expresion = expresion;
    }
}
