package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;
import es.uned.lsi.compiler.intermediate.TemporalFactory;
import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.semantic.ScopeIF;

/**
 * Clase que representa un valor literal en el compilador AdaUNED.
 */
public class Literal extends NonTerminal {

    private String valor;
    private TypeIF type;
    private TemporalIF temporal;

    public Literal() {
        super();
    }

    public Literal(String valor, TypeIF type) {
        super();
        this.valor = valor;
        this.type = type;
    }

    public Literal(Literal other) {
        super();
        this.valor = other.valor;
        this.type = other.type;
        this.temporal = other.temporal;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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

    /**
     * Crea un temporal asociado a este literal, dado un ScopeIF.
     * 
     * @param scope el ámbito actual para generar el temporal
     */
    public void crearTemporal(ScopeIF scope) {
        TemporalFactory factory = new TemporalFactory(scope);
        this.temporal = factory.create();
    }

    @Override
    public String toString() {
        return "Literal{" +
                "valor='" + valor + '\'' +
                ", type=" + (type != null ? type.toString() : "null") +
                ", temporal=" + (temporal != null ? temporal.toString() : "null") +
                '}';
    }
}
