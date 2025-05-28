package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el bloque de declaraciones de subprogramas (funciones y
 * procedimientos)
 * en el compilador AdaUNED.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class DeclSubprogramas extends NonTerminal {

    private List<DeclSubprograma> subprogramas = new ArrayList<>();

    public void addSubprograma(DeclSubprograma subprograma) {
        subprogramas.add(subprograma);
    }
}
