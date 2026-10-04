package pe.edu.upn.tdd;

public class ContadorCircular {
    private int valor;
    private int incremento;
    private int limite;

    public ContadorCircular(int limite) {
        this(0, 1, limite);
    }

    public ContadorCircular(int inicial, int incremento, int limite) {
        this.valor = inicial;
        this.incremento = incremento;
        this.limite = limite;
    }

    public int getValor() {
        return valor;
    }

    public boolean incrementa() {
        valor += incremento;
        return valor > limite;
    }
}