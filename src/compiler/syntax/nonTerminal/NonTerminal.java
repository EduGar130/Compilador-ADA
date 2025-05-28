package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;
import es.uned.lsi.compiler.syntax.nonTerminal.NonTerminalIF;

/**
 * Abstract class for non terminals.
 */
public abstract class NonTerminal
        implements NonTerminalIF {
    private List<QuadrupleIF> intermediateCode;

    /**
     * Constructor for NonTerminal.
     */
    public NonTerminal() {
        super();
        this.intermediateCode = new ArrayList<QuadrupleIF>();
    }

    /**
     * Returns the intermediateCode.
     * 
     * @return Returns the intermediateCode.
     */
    public List<QuadrupleIF> getIntermediateCode() {
        return intermediateCode;
    }

    /**
     * Sets The intermediateCode.
     * 
     * @param intermediateCode The intermediateCode to set.
     */
    public void setIntermediateCode(List<QuadrupleIF> intermediateCode) {
        this.intermediateCode = intermediateCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName() + "{");
        sb.append("intermediateCode=");
        if (intermediateCode.isEmpty()) {
            sb.append("[]");
        } else {
            sb.append("\n");
            for (QuadrupleIF q : intermediateCode) {
                sb.append("  ").append(q.toString()).append("\n");
            }
            sb.append("}");
        }
        return sb.toString();
    }
}