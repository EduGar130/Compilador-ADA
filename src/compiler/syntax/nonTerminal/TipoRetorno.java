package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Clase que representa el tipo de retorno de una función en el compilador
 * AdaUNED.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class TipoRetorno extends NonTerminal {

    /** Tipo de retorno */
    private TypeIF type;

    public TipoRetorno() {
        super();
    }

    public TipoRetorno(TypeIF type) {
        super();
        this.type = type;
    }

    public TipoRetorno(TipoRetorno other) {
        super();
        this.type = other.type;
    }

    public TypeIF getType() {
        return type;
    }

    public void setType(TypeIF type) {
        this.type = type;
    }
}
