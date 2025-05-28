package compiler.syntax.nonTerminal;

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
    private String firstField;

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

    public String getFirstField() {
        return firstField;
    }

    public void setFirstField(String firstField) {
        this.firstField = firstField;
    }

    @Override
    public String toString() {
        return "ExpresionAccesoRegistro{" +
                "type=" + (type != null ? type.toString() : "null") +
                ", temporal=" + (temporal != null ? temporal.toString() : "null") +
                ", firstField='" + (firstField != null ? firstField : "null") + '\'' +
                '}';
    }
}
