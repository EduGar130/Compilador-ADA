package compiler.syntax.nonTerminal;

/**
 * Clase que representa una declaración de función en el compilador AdaUNED.
 * Contiene el símbolo de la función y su tipo de retorno.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class DeclFunction extends NonTerminal {

    private String nombre;
    private DeclParametros parametros;
    private TipoRetorno tipoRetorno;
    private DeclaracionesFunction declaraciones;
    private CuerpoFunction cuerpo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setParametros(DeclParametros parametros) {
        this.parametros = parametros;
    }

    public void setTipoRetorno(TipoRetorno tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }

    public void setDeclaraciones(DeclaracionesFunction declaraciones) {
        this.declaraciones = declaraciones;
    }

    public void setCuerpo(CuerpoFunction cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getNombre() {
        return nombre;
    }

    public DeclParametros getParametros() {
        return parametros;
    }

    public TipoRetorno getTipoRetorno() {
        return tipoRetorno;
    }

    public DeclaracionesFunction getDeclaraciones() {
        return declaraciones;
    }

    public CuerpoFunction getCuerpo() {
        return cuerpo;
    }

    @Override
    public String toString() {
        return "DeclFunction{" +
                "nombre='" + (nombre != null ? nombre : "null") + '\'' +
                ", parametros=" + (parametros != null ? parametros.toString() : "null") +
                ", tipoRetorno=" + (tipoRetorno != null ? tipoRetorno.toString() : "null") +
                ", declaraciones=" + (declaraciones != null ? declaraciones.toString() : "null") +
                ", cuerpo=" + (cuerpo != null ? cuerpo.toString() : "null") +
                '}';
    }
}
