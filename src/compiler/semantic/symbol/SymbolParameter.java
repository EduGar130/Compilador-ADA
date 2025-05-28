package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolParameter.
 * Representa un parámetro formal de un subprograma (función o procedimiento).
 * Puede ser por valor (IN) o por referencia (OUT).
 */
public class SymbolParameter extends SymbolBase {

    private boolean isReference; // true si es OUT (por referencia), false si es IN (por valor)

    /**
     * Constructor para SymbolParameter.
     * 
     * @param scope El ámbito de declaración.
     * @param name  El nombre del parámetro.
     * @param type  El tipo del parámetro.
     */
    public SymbolParameter(ScopeIF scope, String name, TypeIF type) {
        super(scope, name, type);
        this.isReference = false; // Por defecto, los parámetros son IN
    }

    /**
     * Establece si el parámetro es por referencia (OUT).
     * 
     * @param isReference true si es OUT, false si es IN
     */
    public void setIsReference(boolean isReference) {
        this.isReference = isReference;
    }

    /**
     * Devuelve true si el parámetro es OUT (por referencia).
     */
    public boolean isReference() {
        return this.isReference;
    }
}
