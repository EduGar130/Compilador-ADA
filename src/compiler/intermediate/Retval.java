package compiler.intermediate;

import es.uned.lsi.compiler.intermediate.OperandIF;

/**
 * Representa el valor de retorno de una función.
 */
public class Retval implements OperandIF {

    @Override
    public String toString() {
        return "RETVAL";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Retval;
    }

    @Override
    public int hashCode() {
        return "RETVAL".hashCode();
    }
}
