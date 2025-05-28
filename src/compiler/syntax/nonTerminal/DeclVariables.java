package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una colección de declaraciones de variables.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class DeclVariables extends NonTerminal {

    /** Lista de variables */
    private List<DeclVariable> variables = new ArrayList<>();

    public DeclVariables() {
        super();
    }

    public void addVariable(DeclVariable variable) {
        variables.add(variable);
    }

    public List<DeclVariable> getVariables() {
        return variables;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DeclVariables{");
        sb.append("variables=");
        if (variables.isEmpty()) {
            sb.append("[]");
        } else {
            sb.append("\n");
            for (DeclVariable variable : variables) {
                sb.append("  ").append(variable.toString()).append("\n");
            }
            sb.append("}");
        }
        return sb.toString();
    }
}
