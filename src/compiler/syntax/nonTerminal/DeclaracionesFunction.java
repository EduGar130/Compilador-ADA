package compiler.syntax.nonTerminal;

/**
 * Clase que representa las declaraciones locales de una función en el
 * compilador AdaUNED.
 * Incluye constantes, tipos, variables y subprogramas declarados dentro del
 * cuerpo.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.5
 */
public class DeclaracionesFunction extends NonTerminal {

    private GrupoDeclaraciones1 grupoDeclaraciones1;

    public void setGrupoDeclaraciones1(GrupoDeclaraciones1 grupoDeclaraciones1) {
        this.grupoDeclaraciones1 = grupoDeclaraciones1;
    }

    public GrupoDeclaraciones1 getGrupoDeclaraciones1() {
        return grupoDeclaraciones1;
    }

    @Override
    public String toString() {
        return "DeclaracionesFunction{" +
                "grupoDeclaraciones1=" + (grupoDeclaraciones1 != null ? grupoDeclaraciones1.toString() : "null") +
                '}';
    }
}
