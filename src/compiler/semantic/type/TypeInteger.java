package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Clase que representa el tipo primitivo INTEGER.
 */
public class TypeInteger extends TypeBase {

    public TypeInteger(ScopeIF scope) {
        super(scope);
        setName("INTEGER");
    }

    @Override
    public int getSize() {
        // Tamaño típico de entero en memoria
        return 4;
    }
}
