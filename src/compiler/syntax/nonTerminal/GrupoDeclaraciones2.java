package compiler.syntax.nonTerminal;

/**
 * Clase que representa el segundo grupo de declaraciones (tipos) del compilador
 * AdaUNED.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class GrupoDeclaraciones2 extends NonTerminal {

    private DeclVariables declVariables;
    private GrupoDeclaraciones3 grupoDeclaraciones3;

    public void setDeclVariables(DeclVariables declVariables) {
        this.declVariables = declVariables;
    }

    public void setGrupoDeclaraciones3(GrupoDeclaraciones3 grupoDeclaraciones3) {
        this.grupoDeclaraciones3 = grupoDeclaraciones3;
    }

    public DeclVariables getDeclVariables() {
        return declVariables;
    }

    public GrupoDeclaraciones3 getGrupoDeclaraciones3() {
        return grupoDeclaraciones3;
    }

    @Override
    public String toString() {
        return "GrupoDeclaraciones2{" +
                "declVariables=" + (declVariables != null ? declVariables.toString() : "null") +
                ", grupoDeclaraciones3=" + (grupoDeclaraciones3 != null ? grupoDeclaraciones3.toString() : "null") +
                '}';
    }
}
