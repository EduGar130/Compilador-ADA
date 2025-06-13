package compiler.intermediate;

import es.uned.lsi.compiler.intermediate.LabelIF;
import es.uned.lsi.compiler.intermediate.ProcedureIF;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.intermediate.LabelFactory;

/**
 * Class for procedures and functions in intermediate code.
 * 
 * @author Eduardo Garcia Romera
 * @email egarcia3266@alumno.uned.es
 * @dni 54487155V
 * @version 1.0
 */
public class Procedure implements ProcedureIF {
    private String name = null;
    private ScopeIF scope = null;
    private LabelIF codeLabel;

    /**
     * Constructor for Procedure.
     * 
     * @param name  The name.
     * @param scope The scope.
     */
    public Procedure(String name, ScopeIF scope) {
        super();
        this.name = name;
        this.scope = scope;
        this.codeLabel = new LabelFactory().create();
    }

    /**
     * Returns the name.
     * 
     * @return Returns the name.
     */
    @Override
    public final String getName() {
        return name;
    }

    /**
     * Returns the scope.
     * 
     * @return Returns the scope.
     */
    @Override
    public final ScopeIF getScope() {
        return scope;
    }

    /**
     * Returns the code label.
     * 
     * @return Returns the code label.
     */
    @Override
    public final LabelIF getCodeLabel() {
        return codeLabel;
    }

    @Override
    public final boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof Procedure)) {
            return false;
        }

        final Procedure aVariable = (Procedure) other;
        return ((scope == null) ? (aVariable.scope == null) : (aVariable.scope.equals(scope))) &&
                ((name == null) ? (aVariable.name == null) : (aVariable.name.equals(name)));
    }

    @Override
    public final int hashCode() {
        return 31 * scope.hashCode() +
                ((name == null) ? 0 : name.hashCode());
    }

    @Override
    public final String toString() {
        return name;
    }
}
