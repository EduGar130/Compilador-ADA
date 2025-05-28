package compiler.syntax.nonTerminal;

/**
 * Clase que representa una sentencia put_line en el compilador AdaUNED.
 * Contiene el temporal que representa el valor que se va a imprimir.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */

public class SentenciaPutLine extends Sentencia {

    private Parametro parametro;

    public SentenciaPutLine() {
        super();
    }

    public Parametro getParametro() {
        return parametro;
    }

    public void setParametro(Parametro parametro) {
        this.parametro = parametro;
    }
}
