package compiler.semantic.symbol;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Clase para representar procedimientos en AdaUNED.
 * 
 * Nombre: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class SymbolProcedure extends SymbolBase {

    /** Lista de parámetros formales del procedimiento */
    private List<SymbolParameter> parameterList = new ArrayList<>();

    /**
     * Constructor de SymbolProcedure.
     * 
     * @param scope Ámbito de declaración.
     * @param name  Nombre del procedimiento.
     */
    public SymbolProcedure(ScopeIF scope, String name) {
        super(scope, name, null); // TO DO
    }

    /**
     * Constructor de SymbolProcedure (con tipo, por herencia de función).
     * 
     * @param scope Ámbito de declaración.
     * @param name  Nombre del procedimiento.
     * @param type  Tipo asociado (normalmente null para procedimientos).
     */
    public SymbolProcedure(ScopeIF scope, String name, TypeIF type) {
        super(scope, name, type);
    }

    /**
     * Devuelve la lista de parámetros formales.
     * 
     * @return Lista de parámetros.
     */
    public List<SymbolParameter> getParameterList() {
        return parameterList;
    }

    /**
     * Asigna la lista de parámetros formales.
     * 
     * @param parameterList Lista a asignar.
     */
    public void setParameterList(List<SymbolParameter> parameterList) {
        this.parameterList = parameterList;
    }

    /**
     * Añade un parámetro a la lista de parámetros.
     * 
     * @param parameter Parámetro a añadir.
     */
    public void addParameter(SymbolParameter parameter) {
        this.parameterList.add(parameter);
    }
}
