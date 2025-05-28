package compiler.syntax.nonTerminal;

/**
 * Clase que representa una declaración de parámetro en el compilador AdaUNED.
 * Contiene el símbolo del parámetro y su tipo.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class DeclParametro extends NonTerminal {

    private ListaParametros listaParametros;
    private Tipo tipo;
    private boolean salida;

    public void setListaParametros(ListaParametros listaParametros) {
        this.listaParametros = listaParametros;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setSalida(boolean salida) {
        this.salida = salida;
    }

    public ListaParametros getListaParametros() {
        return listaParametros;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public boolean isSalida() {
        return salida;
    }

    @Override
    public String toString() {
        return "DeclParametro{" +
                "listaParametros=" + (listaParametros != null ? listaParametros.toString() : "null") +
                ", tipo=" + (tipo != null ? tipo.toString() : "null") +
                ", salida=" + salida +
                '}';
    }
}
