package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Clase para representar un tipo RECORD en el compilador AdaUNED.
 * 
 * Nombre: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class TypeRecord extends TypeBase {

    /** Campos del RECORD: nombre del campo → tipo del campo */
    private Map<String, TypeIF> campos;

    /**
     * Constructor para TypeRecord.
     * 
     * @param scope Ámbito de declaración.
     */
    public TypeRecord(ScopeIF scope) {
        super(scope);
        campos = new LinkedHashMap<>();
    }

    /**
     * Constructor para TypeRecord.
     * 
     * @param scope Ámbito de declaración.
     * @param name  Nombre del tipo.
     */
    public TypeRecord(ScopeIF scope, String name) {
        super(scope, name);
        campos = new LinkedHashMap<>();
    }

    /**
     * Constructor de copia para TypeRecord.
     * 
     * @param record El record a copiar.
     */
    public TypeRecord(TypeRecord record) {
        super(record.getScope(), record.getName());
        campos = new LinkedHashMap<>(record.campos);
    }

    /**
     * Añade un campo al record.
     * 
     * @param nombre Nombre del campo.
     * @param tipo   Tipo del campo.
     */
    public void addCampo(String nombre, TypeIF tipo) {
        campos.put(nombre, tipo);
    }

    /**
     * Devuelve el tipo de un campo dado su nombre.
     * 
     * @param nombre Nombre del campo.
     * @return Tipo del campo, o null si no existe.
     */
    public TypeIF getCampo(String nombre) {
        return campos.get(nombre);
    }

    /**
     * Devuelve el número total de campos (tamaño lógico).
     * 
     * @return Número de campos.
     */
    @Override
    public int getSize() {
        return campos.size();
    }

    /**
     * Devuelve todos los campos del RECORD.
     * 
     * @return Mapa de campos.
     */
    public Map<String, TypeIF> getCampos() {
        return campos;
    }
}
