package compiler.syntax.nonTerminal;

/**
 * Clase base para representar cualquier tipo de sentencia en el compilador
 * AdaUNED.
 * Esta clase puede ser extendida o contenida por otras estructuras como
 * Sentencias.
 * 
 * Autor: Eduardo Garcia Romera
 * Email: egarcia3266@alumno.uned.es
 * DNI: 54487155V
 * Versión: 1.0
 */
public class Sentencia extends NonTerminal {

    private SentenciaAsignacion sentenciaAsignacion;
    private SentenciaIf sentenciaIf;
    private SentenciaWhile sentenciaWhile;
    private SentenciaReturn sentenciaReturn;
    private SentenciaPutLine sentenciaPutLine;
    private SentenciaProcedimiento sentenciaProcedimiento;

    public void setSentenciaAsignacion(SentenciaAsignacion sa) {
        this.sentenciaAsignacion = sa;
    }

    public void setSentenciaIf(SentenciaIf si) {
        this.sentenciaIf = si;
    }

    public void setSentenciaWhile(SentenciaWhile sw) {
        this.sentenciaWhile = sw;
    }

    public void setSentenciaReturn(SentenciaReturn sr) {
        this.sentenciaReturn = sr;
    }

    public void setSentenciaPutLine(SentenciaPutLine sp) {
        this.sentenciaPutLine = sp;
    }

    public void setSentenciaProcedimiento(SentenciaProcedimiento spc) {
        this.sentenciaProcedimiento = spc;
    }

    public SentenciaAsignacion getSentenciaAsignacion() {
        return sentenciaAsignacion;
    }

    public SentenciaIf getSentenciaIf() {
        return sentenciaIf;
    }

    public SentenciaWhile getSentenciaWhile() {
        return sentenciaWhile;
    }

    public SentenciaReturn getSentenciaReturn() {
        return sentenciaReturn;
    }

    public SentenciaPutLine getSentenciaPutLine() {
        return sentenciaPutLine;
    }

    public SentenciaProcedimiento getSentenciaProcedimiento() {
        return sentenciaProcedimiento;
    }

    @Override
    public String toString() {
        return "Sentencia{" +
                "sentenciaAsignacion=" + (sentenciaAsignacion != null ? sentenciaAsignacion.toString() : "null") +
                ", sentenciaIf=" + (sentenciaIf != null ? sentenciaIf.toString() : "null") +
                ", sentenciaWhile=" + (sentenciaWhile != null ? sentenciaWhile.toString() : "null") +
                ", sentenciaReturn=" + (sentenciaReturn != null ? sentenciaReturn.toString() : "null") +
                ", sentenciaPutLine=" + (sentenciaPutLine != null ? sentenciaPutLine.toString() : "null") +
                ", sentenciaProcedimiento="
                + (sentenciaProcedimiento != null ? sentenciaProcedimiento.toString() : "null") +
                '}';
    }
}
