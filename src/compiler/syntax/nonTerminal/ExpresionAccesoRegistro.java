package compiler.syntax.nonTerminal;

import compiler.intermediate.Field;
import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Clase que representa una expresión de acceso a un campo de un registro en el
 * compilador AdaUNED.
 * Por ejemplo: persona.edad
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */

public class ExpresionAccesoRegistro extends NonTerminal {

    private TypeIF type;
    private TemporalIF temporal;
    private String name;
    private ExpresionAccesoRegistro registro;
    private Field field;

    /**
     * Constructor por defecto.
     */
    public ExpresionAccesoRegistro() {
        super();
    }

    public TypeIF getType() {
        return type;
    }

    public void setType(TypeIF type) {
        this.type = type;
    }

    public TemporalIF getTemporal() {
        return temporal;
    }

    public void setTemporal(TemporalIF temporal) {
        this.temporal = temporal;
    }

    public ExpresionAccesoRegistro getRegistro() {
        return registro;
    }

    public void setRegistro(ExpresionAccesoRegistro registro) {
        this.registro = registro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    @Override
    public String toString() {
        if (registro != null) {
            return name + "." + registro.toString();
        } else {
            return name;
        }
    }
}
