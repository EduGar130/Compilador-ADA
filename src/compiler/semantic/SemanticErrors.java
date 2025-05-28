package compiler.semantic;

public class SemanticErrors {
    public final static String CE = " -- Codigo de error: ";
    public final static String NPV = "[El axioma no ha generado un programa válido]" + CE + "1";
    public final static String NDC = "[No se han definido correctamente las declaraciones]" + CE + "2";
    public final static String CPI = "[El cuerpo principal del programa es inválido]" + CE + "3";
}