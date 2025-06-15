package compiler.intermediate;

/**
 * @author Eduardo García Romera
 *
 */
public class Nemonic {
    public final static String AND = "AND"; // AND x y z --> x := y && z (conjunción)
    public final static String BR = "BR"; // BR L --> Saltar a L (salto incondicional)
    public final static String BRF = "BRF"; // BRF x L --> Si !x, saltar a L (salto condicional negado)
    public final static String CALL = "CALL"; // CALL f --> Llama a la función f (llamada a función)
    public final static String HALT = "HALT"; // HALT --> Stop (fin de programa)
    public final static String INIT = "INIT"; // INIT --> Inicialización (inicio de programa)
    public final static String INL = "INL"; // INL L --> Insertar L: en la tabla de etiquetas (etiqueta)
    public final static String SUB = "SUB"; // SUB x y z --> x := y - z (resta)
    public final static String MUL = "MUL"; // MUL x y z --> x := y * z (multiplicacin)
    public final static String MV = "MV"; // MV x y --> x := y (asignación)
    public final static String MVR = "MVR"; // MVR x y --> x := &y (asignación de dirección)
    // public final static String MVP = "MVP"; // MVP x y --> x := *y (indirección)

    public final static String NEQ = "NEQ"; // NEQ x y z --> x := (y != z) (desigualdad)
    public final static String GR = "GR"; // GR x y z --> x := (y > z) (mayor)

    public final static String WRSTR = "WRSTR"; // WRSTR s --> Escribe el String s por pantalla (write string)
    public final static String WRINT = "WRINT"; // WRINT n --> Escribe el entero n por pantalla (write integer)

    // Nemonicos simbolicos
    public final static String TYPE_USED = "TYPE_USED"; // TYPE_USED T --> Indica que el tipo T ha sido utilizado
    public final static String MOVE = "MOVE"; // MOVE x y --> Mueve el valor de x a y (copia de valor)
    public final static String DECL = "DECL"; // DECL x --> Declara la variable x (declaración de variable)
    public final static String CADENA = "CADENA"; // CADENA s --> Declara la cadena s (declaración de cadena)

    public final static String VARGLOBAL = "VARGLOBAL"; // VARGLOBAL x --> Declara la variable global x

    public final static String CONSTANT = "CONSTANT"; // Constant x --> Declara constante x

    public final static String ACCESO = "ACCESO"; // ACCESO x.y --> Acceso al campo de un registro
}