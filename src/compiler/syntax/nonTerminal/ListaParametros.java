package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una lista de parámetros en el compilador AdaUNED.
 * Acumula los parámetros definidos en una función o procedimiento.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class ListaParametros extends NonTerminal {

    private List<String> identificadores = new ArrayList<>();

    public void addIdentificador(String id) {
        identificadores.add(id);
    }

    public List<String> getIdentificadores() {
        return identificadores;
    }
}