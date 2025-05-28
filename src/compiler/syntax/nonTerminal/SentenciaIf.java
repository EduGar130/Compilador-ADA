package compiler.syntax.nonTerminal;

/**
 * Clase que representa una sentencia condicional IF en el compilador AdaUNED.
 * Contiene el temporal que representa la condición evaluada.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class SentenciaIf extends Sentencia {

    private Expresion condicion;
    private Sentencias cuerpoThen;
    private Sentencias cuerpoElse; // Opcional, puede ser null

    public SentenciaIf() {
        super();
    }

    public Expresion getCondicion() {
        return condicion;
    }

    public void setCondicion(Expresion condicion) {
        this.condicion = condicion;
    }

    public Sentencias getCuerpoThen() {
        return cuerpoThen;
    }

    public void setCuerpoThen(Sentencias cuerpoThen) {
        this.cuerpoThen = cuerpoThen;
    }

    public Sentencias getCuerpoElse() {
        return cuerpoElse;
    }

    public void setCuerpoElse(Sentencias cuerpoElse) {
        this.cuerpoElse = cuerpoElse;
    }
}
