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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DeclSubprogramas{");
        sb.append("subprogramas=");
        if (subprogramas.isEmpty()) {
            sb.append("[]");
        } else {
            sb.append("\n");
            for (DeclSubprograma subprograma : subprogramas) {
                sb.append("  ").append(subprograma.toString()).append("\n");
            }
            sb.append("}");
        }
        return sb.toString();
    }
}
