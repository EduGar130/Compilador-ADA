package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

import java.util.List;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;
import es.uned.lsi.compiler.intermediate.TemporalIF;

/**
 * Clase que representa una expresión evaluable en el compilador AdaUNED.
 * Puede ser una operación aritmética, relacional, lógica, un literal, o una
 * invocación a función.
 * 
 * Contiene su tipo semántico y el temporal donde se almacena su valor
 * intermedio.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class Expresion extends NonTerminal {

    /** Tipo de la expresión */
    private TypeIF type;

    /** Indica si la expresión es código muerto (dead code) */
    private boolean isDeadCode;

    /** Temporal donde se guarda el resultado */
    private TemporalIF temporal;

    /** Código intermedio generado */
    private List<QuadrupleIF> intermediateCode;

    private ExpresionAccesoRegistro registro;

    public Expresion() {
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

    public List<QuadrupleIF> getIntermediateCode() {
        return intermediateCode;
    }

    public void setIntermediateCode(List<QuadrupleIF> intermediateCode) {
        this.intermediateCode = intermediateCode;
    }

    public boolean isDeadCode() {
        return isDeadCode;
    }

    public void setDeadCode(boolean deadCode) {
        isDeadCode = deadCode;
    }

    public ExpresionAccesoRegistro getRegistro() {
        return registro;
    }

    public void setRegistro(ExpresionAccesoRegistro registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Expresion{" +
                "type=" + (type != null ? type.toString() : "null") +
                ", temporal=" + (temporal != null ? temporal.toString() : "null") +
                ", intermediateCode=" + (intermediateCode != null ? intermediateCode.toString() : "null") +
                '}';
    }
}