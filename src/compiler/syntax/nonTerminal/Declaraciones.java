package compiler.syntax.nonTerminal;

/**
 * Clase que representa el bloque de declaraciones globales del programa en el
 * compilador AdaUNED.
 * Agrupa constantes, tipos, variables y subprogramas en el orden definido por
 * la gramática.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class Declaraciones extends NonTerminal {

    private DeclConstantes declConstantes;
    private GrupoDeclaraciones1 grupoDeclaraciones1;

    public void setDeclConstantes(DeclConstantes declConstantes) {
        this.declConstantes = declConstantes;
    }

    public void setGrupoDeclaraciones1(GrupoDeclaraciones1 grupoDeclaraciones1) {
        this.grupoDeclaraciones1 = grupoDeclaraciones1;
    }

    public DeclConstantes getDeclConstantes() {
        return declConstantes;
    }

    public GrupoDeclaraciones1 getGrupoDeclaraciones1() {
        return grupoDeclaraciones1;
    }
}
