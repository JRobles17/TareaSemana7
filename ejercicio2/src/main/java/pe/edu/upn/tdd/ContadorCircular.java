package pe.edu.upn.tdd;

public class ContadorCircular {

        private int valor;

    public ContadorCircular(int limite) {
        this(0, 1, limite);
    }

    public ContadorCircular(int inicial, int incremento, int limite) {
        this.valor = inicial;
    }
        public int getValor() {
        return valor;
    }

    public void incrementa() {
        valor++;
    }
}

