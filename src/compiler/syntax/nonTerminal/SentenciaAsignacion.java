package compiler.syntax.nonTerminal;

/**
 * Clase que representa una sentencia de asignación en el compilador AdaUNED.
 * Contiene la referencia izquierda (LHS) y la expresión derecha (RHS).
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class SentenciaAsignacion extends NonTerminal {

    private Ref ref;
    private Expresion expresion;

    public Ref getRef() {
        return ref;
    }

    public void setRef(Ref ref) {
        this.ref = ref;
    }

    public Expresion getExpresion() {
        return expresion;
    }

    public void setExpresion(Expresion expresion) {
        this.expresion = expresion;
    }
}
