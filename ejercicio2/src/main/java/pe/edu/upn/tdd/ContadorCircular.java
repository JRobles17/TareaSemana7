package pe.edu.upn.tdd;

public class ContadorCircular {
    private int inicial;
    private int valor;
    private int incremento;
    private int limite;

    public ContadorCircular(int limite) {
        this(0, 1, limite);
    }

    public ContadorCircular(int inicial, int incremento, int limite) {
        this.inicial = inicial;
        this.valor = inicial;
        this.incremento = incremento;
        this.limite = limite;
    }

    public int getValor() {
        return valor;
    }

    public boolean incrementa() {
        valor += incremento;
        boolean limiteSuperado = valor > limite;
        if (limiteSuperado) {
            valor = inicial;
        }
        return limiteSuperado;
    }

    public void resetea() {
        valor = inicial;
    }
}