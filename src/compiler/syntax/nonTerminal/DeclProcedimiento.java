package compiler.syntax.nonTerminal;

public class DeclProcedimiento extends NonTerminal {

    private String nombre;
    private DeclParametros parametros;
    private DeclaracionesFunction declaraciones;
    private Cuerpo cuerpo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setParametros(DeclParametros parametros) {
        this.parametros = parametros;
    }

    public void setDeclaraciones(DeclaracionesFunction declaraciones) {
        this.declaraciones = declaraciones;
    }

    public void setCuerpo(Cuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getNombre() {
        return nombre;
    }

    public DeclParametros getParametros() {
        return parametros;
    }

    public DeclaracionesFunction getDeclaraciones() {
        return declaraciones;
    }

    public Cuerpo getCuerpo() {
        return cuerpo;
    }
}
