package compiler.syntax.nonTerminal;

/**
 * Clase que representa el tercer grupo de declaraciones (variables) del
 * compilador AdaUNED.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class GrupoDeclaraciones3 extends NonTerminal {

    private DeclSubprogramas declSubprogramas;

    public void setDeclSubprogramas(DeclSubprogramas declSubprogramas) {
        this.declSubprogramas = declSubprogramas;
    }

    public DeclSubprogramas getDeclSubprogramas() {
        return declSubprogramas;
    }

    @Override
    public String toString() {
        return "GrupoDeclaraciones3{" +
                "declSubprogramas=" + (declSubprogramas != null ? declSubprogramas.toString() : "null") +
                '}';
    }
}
