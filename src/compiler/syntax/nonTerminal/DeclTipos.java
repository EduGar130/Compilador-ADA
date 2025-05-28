package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una colección de tipos.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class DeclTipos extends NonTerminal {

    /** Lista de tipos */
    private List<DeclTipo> tipos = new ArrayList<>();

    public DeclTipos() {
        super();
    }

    public void addTipo(DeclTipo tipo) {
        tipos.add(tipo);
    }

    public List<DeclTipo> getTipos() {
        return tipos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DeclTipos{");
        sb.append("tipos=");
        if (tipos.isEmpty()) {
            sb.append("[]");
        } else {
            sb.append("\n");
            for (DeclTipo tipo : tipos) {
                sb.append("  ").append(tipo.toString()).append("\n");
            }
            sb.append("}");
        }
        return sb.toString();
    }
}
