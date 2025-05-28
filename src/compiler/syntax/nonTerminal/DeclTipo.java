package compiler.syntax.nonTerminal;

import compiler.semantic.type.TypeRecord;

/**
 * Clase que representa una declaración de tipo (record) en AdaUNED.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class DeclTipo extends NonTerminal {

    private TypeRecord tipoRecord;

    public DeclTipo() {
        super();
    }

    public DeclTipo(TypeRecord tipoRecord) {
        super();
        this.tipoRecord = tipoRecord;
    }

    public TypeRecord getTipoRecord() {
        return tipoRecord;
    }

    public void setTipoRecord(TypeRecord tipoRecord) {
        this.tipoRecord = tipoRecord;
    }
}
