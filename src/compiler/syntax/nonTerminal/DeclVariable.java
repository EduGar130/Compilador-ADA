package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Clase que representa una declaración individual de variable.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class DeclVariable extends NonTerminal {

    /** Nombre de la variable */
    private String nombre;

    /** Tipo de la variable */
    private TypeIF tipo;

    /** Constructor vacío */
    public DeclVariable() {
        super();
    }

    /** Constructor completo */
    public DeclVariable(String nombre, TypeIF tipo) {
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

    public TypeIF getTipo() {
        return tipo;
    }

    public void setTipo(TypeIF tipo) {
        this.tipo = tipo;
    }
}
