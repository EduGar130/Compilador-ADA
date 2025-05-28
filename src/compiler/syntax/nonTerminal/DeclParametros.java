package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa la declaración de parámetros de un subprograma.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */

public class DeclParametros extends NonTerminal {

    private List<DeclParametro> parametros = new ArrayList<>();

    public void addParametro(DeclParametro parametro) {
        parametros.add(parametro);
    }

    public List<DeclParametro> getParametros() {
        return parametros;
    }
}
