package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una lista de declaraciones de campos dentro de un
 * registro en el compilador AdaUNED.
 * Agrupa múltiples objetos DeclCampo que describen los campos del tipo record.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class DeclCampos extends NonTerminal {

    /** Lista de campos */
    private List<DeclCampo> campos;

    /** Constructor por defecto */
    public DeclCampos() {
        super();
        this.campos = new ArrayList<>();
    }

    /**
     * Constructor con lista de campos
     * 
     * @param campos lista de campos
     */
    public DeclCampos(List<DeclCampo> campos) {
        super();
        this.campos = campos;
    }

    /**
     * Constructor de copia
     * 
     * @param other otra instancia de DeclCampos
     */
    public DeclCampos(DeclCampos other) {
        super();
        this.campos = new ArrayList<>(other.campos);
    }

    public List<DeclCampo> getCampos() {
        return campos;
    }

    public void setCampos(List<DeclCampo> campos) {
        this.campos = campos;
    }

    /**
     * Añade un nuevo campo a la lista
     * 
     * @param campo campo a añadir
     */
    public void addCampo(DeclCampo campo) {
        this.campos.add(campo);
    }

    @Override
    public String toString() {
        return "DeclCampos{" +
                "campos=" + (campos != null ? campos.toString() : "null") +
                '}';
    }
}
