package compiler.syntax.nonTerminal;

/**
 * Clase que representa el primer grupo de declaraciones (constantes) del
 * compilador AdaUNED.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class GrupoDeclaraciones1 extends NonTerminal {

    private DeclTipos declTipos;
    private GrupoDeclaraciones2 grupoDeclaraciones2;

    public void setDeclTipos(DeclTipos declTipos) {
        this.declTipos = declTipos;
    }

    public void setGrupoDeclaraciones2(GrupoDeclaraciones2 grupoDeclaraciones2) {
        this.grupoDeclaraciones2 = grupoDeclaraciones2;
    }

    public DeclTipos getDeclTipos() {
        return declTipos;
    }

    public GrupoDeclaraciones2 getGrupoDeclaraciones2() {
        return grupoDeclaraciones2;
    }
}
