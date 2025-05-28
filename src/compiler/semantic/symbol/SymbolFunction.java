package compiler.semantic.symbol;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Clase para representar una función en AdaUNED.
 * 
 * Nombre: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class SymbolFunction extends SymbolProcedure {

    /** Lista de parámetros formales de la función */
    private List<SymbolParameter> parameterList = new ArrayList<>();

    /**
     * Constructor de SymbolFunction.
     * 
     * @param scope Ámbito de declaración.
     * @param name  Nombre de la función.
     * @param type  Tipo de retorno de la función.
     */
    public SymbolFunction(ScopeIF scope, String name, TypeIF type) {
        super(scope, name, type);
    }

    /**
     * Constructor de SymbolFunction con lista de parámetros.
     * 
     * @param scope         Ámbito de declaración.
     * @param name          Nombre de la función.
     * @param type          Tipo de retorno de la función.
     * @param parameterList Lista de parámetros formales de la función.
     */
    public SymbolFunction(ScopeIF scope, String name, TypeIF type, List<SymbolParameter> parameterList) {
        super(scope, name, type);
        this.parameterList = parameterList;
    }

    /**
     * Devuelve la lista de parámetros formales de la función.
     * 
     * @return Lista de parámetros.
     */
    public List<SymbolParameter> getParameterList() {
        return parameterList;
    }

    /**
     * Establece la lista de parámetros formales de la función.
     * 
     * @param parameterList Lista de parámetros a asignar.
     */
    public void setParameterList(List<SymbolParameter> parameterList) {
        this.parameterList = parameterList;
    }

    /**
     * Añade un parámetro a la función.
     * 
     * @param parameter Parámetro a añadir.
     */
    public void addParameter(SymbolParameter parameter) {
        parameterList.add(parameter);
    }
}
