package pe.edu.upn.tdd;

public class ContadorCircular {

    private final int inicial;
    private final int incremento;
    private final int limite;
    private int valor;

    public ContadorCircular(int limite) {
        this(0, 1, limite);
    }

    
    public ContadorCircular(int inicial, int incremento, int limite) {
        this.inicial = inicial;
        this.incremento = incremento;
        this.limite = limite;
        this.valor = inicial;
        if (incremento <= 0) {
            throw new IllegalArgumentException("El incremento debe ser positivo");
        }
        if (limite < inicial) {
            throw new IllegalArgumentException("El límite no puede ser menor que el inicial");
        }
    }

    public int getValor() {
        return valor;
    }

    public boolean incrementa() {
        valor += incremento;
        boolean limiteSuperado = valor > limite;
        if (limiteSuperado) {
            resetea();
        }
        return limiteSuperado;
    }

    public void resetea() {
        valor = inicial;
    }


}