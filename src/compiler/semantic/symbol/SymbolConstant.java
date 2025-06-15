package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Nombre: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * 
 * Clase para representar una constante simbólica en el compilador AdaUNED.
 * Una constante está caracterizada por un valor asociado y un tipo.
 * 
 * Versión: 1.0
 */
public class SymbolConstant extends SymbolBase {

    /** Valor de la constante. */
    private Object value;

    /** Dirección de memoria asociada a la constante (si aplica). */
    private int address;

    /**
     * Constructor de SymbolConstant.
     * 
     * @param name  Nombre de la constante.
     * @param scope Ámbito de declaración
     * @param type  Tipo de la constante.
     */
    public SymbolConstant(String name, ScopeIF scope, TypeIF type) {
        super(scope, name, type);
    }

    /**
     * Establece el valor de la constante.
     * 
     * @param value El valor a asignar.
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la constante.
     * 
     * @return El valor de la constante.
     */
    public Object getValue() {
        return value;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getAddress() {
        return address;
    }
}
