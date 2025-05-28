package compiler.intermediate;

import es.uned.lsi.compiler.intermediate.OperandIF;

/**
 * Representa un campo de un registro (estructura record).
 */
public class Field implements OperandIF {

    private final Variable registro;
    private final String campo;

    public Field(Variable registro, String campo) {
        this.registro = registro;
        this.campo = campo;
    }

    public Variable getRegistro() {
        return registro;
    }

    public String getCampo() {
        return campo;
    }

    @Override
    public String toString() {
        return registro.getName() + "." + campo;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Field))
            return false;
        Field other = (Field) obj;
        return registro.equals(other.registro) && campo.equals(other.campo);
    }

    @Override
    public int hashCode() {
        return (registro.getName() + "." + campo).hashCode();
    }
}
