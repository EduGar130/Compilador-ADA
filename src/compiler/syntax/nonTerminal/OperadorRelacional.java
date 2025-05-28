package compiler.syntax.nonTerminal;

/**
 * Clase que representa un operador relacional en el compilador AdaUNED.
 * Contiene el símbolo del operador (ej: =, /=, <, <=, >, >=).
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class OperadorRelacional extends NonTerminal {
    private String operacion;

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getOperacion() {
        return operacion;
    }

    @Override
    public String toString() {
        return "OperadorRelacional{" +
                "operacion='" + operacion + '\'' +
                '}';
    }
}