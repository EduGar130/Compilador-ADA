package compiler.intermediate;

import java.util.Map;

import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Representa un campo de un registro (estructura record).
 */
public class Field implements OperandIF {

    private final Variable registro;
    private final String campo;
    private int address = 0;

    public Field(Variable registro, String campo) {
        this.registro = registro;
        this.campo = campo;
    }

    public Field(Variable registro, String campo, Map<String, TypeIF> campos) {
        this(registro, campo);

        int offset = registro.getAddress();
        System.out.println("Offset: " + offset);
        this.address = inicializarAddress(offset, campos);
        System.out.println("Address del campo " + campo + ": " + this.address);
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

    public void setAddress(int address) {
        this.address = address;
    }

    public int getAddress() {
        return address;
    }

    public int inicializarAddress(int offset, Map<String, TypeIF> campos) {
        int currentOffset = offset;

        for (Map.Entry<String, TypeIF> entry : campos.entrySet()) {
            String nombreCampo = entry.getKey();
            TypeIF tipoCampo = entry.getValue();

            if (!nombreCampo.equals(campo)) {
                currentOffset -= tipoCampo.getSize();
            } else {
                return currentOffset;
            }
        }
        throw new IllegalArgumentException("Campo " + campo + " no encontrado en el registro " + registro.getName());
    }

}
