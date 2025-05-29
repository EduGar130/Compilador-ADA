package compiler.semantic;

public class SemanticErrors {
    public final static String CE = " -- Codigo de error: ";
    public final static String NPV = "[Se ha producido un valor nulo inesperado en una regla de la gramática. Es posible que una subproducción no haya generado correctamente su resultado.]"
            + CE + "1";
    public final static String NDC = "[No se han definido correctamente las declaraciones]" + CE + "2";
    public final static String CPI = "[El cuerpo principal del programa es inválido]" + CE + "3";
}