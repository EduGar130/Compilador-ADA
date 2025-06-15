package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Clase para representar una variable simbólica en el compilador AdaUNED.
 * 
 * Nombre: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class SymbolVariable extends SymbolBase {

    /** Dirección de memoria asociada a la variable. */
    private int address;

    /**
     * Constructor for SymbolVariable.
     * 
     * @param scope The declaration scope.
     * @param name  The symbol name.
     * @param type  The symbol type.
     */
    public SymbolVariable(ScopeIF scope,
            String name,
            TypeIF type) {
        super(scope, name, type);
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getAddress() {
        return address;
    }
}
