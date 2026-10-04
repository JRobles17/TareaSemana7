package pe.edu.upn.tdd;

public class ContadorCircular {
    private int valor;
    private int incremento;

    public ContadorCircular(int limite) {
        this(0, 1, limite);
    }

    public ContadorCircular(int inicial, int incremento, int limite) {
        this.valor = inicial;
        this.incremento = incremento;
    }

    public int getValor() {
        return valor;
    }

    public void incrementa() {
        valor += incremento;
    }
}