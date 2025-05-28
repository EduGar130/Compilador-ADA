package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Clase que representa el tipo primitivo BOOLEAN.
 */
public class TypeBoolean extends TypeBase {

    public TypeBoolean(ScopeIF scope) {
        super(scope);
        setName("BOOLEAN");
    }

    @Override
    public int getSize() {
        // Tamaño típico de booleano en memoria
        return 1;
    }
}
