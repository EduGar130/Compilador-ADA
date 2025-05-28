package compiler.syntax.nonTerminal;

/**
 * Clase que representa un campo individual de un record.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class DeclCampo extends NonTerminal {

    /** Nombre del campo */
    private String nombre;

    /** Tipo del campo */
    private Tipo tipo;

    /** Constructor vacío */
    public DeclCampo() {
        super();
    }

    /** Constructor completo */
    public DeclCampo(String nombre, Tipo tipo) {
        super();
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "DeclCampo{" +
                "nombre='" + (nombre != null ? nombre : "null") + '\'' +
                ", tipo=" + (tipo != null ? tipo.toString() : "null") +
                '}';
    }
}
