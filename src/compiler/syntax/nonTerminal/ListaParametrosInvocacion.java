package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una lista de parámetros en una invocación (call) en el
 * compilador AdaUNED.
 * Contiene los temporales que almacenan los valores de cada parámetro evaluado.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class ListaParametrosInvocacion extends NonTerminal {

    /** Lista de las expresiones evaluadas para los parámetros */
    private List<Expresion> parametros;

    /** Constructor por defecto */
    public ListaParametrosInvocacion() {
        super();
        this.parametros = new ArrayList<>();
    }

    /**
     * Constructor con lista de temporales
     * 
     * @param parametros lista de temporales
     */
    public ListaParametrosInvocacion(List<Expresion> parametros) {
        super();
        this.parametros = parametros;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de ListaParametrosInvocacion
     */
    public ListaParametrosInvocacion(ListaParametrosInvocacion other) {
        super();
        this.parametros = new ArrayList<>(other.parametros);
    }

    public List<Expresion> getParametros() {
        return parametros;
    }

    public void setParametros(List<Expresion> parametros) {
        this.parametros = parametros;
    }

    /**
     * Añade un temporal a la lista de parámetros
     * 
     * @param temporal temporal evaluado
     */
    public void addParametro(Expresion parametros) {
        this.parametros.add(parametros);
    }
}
