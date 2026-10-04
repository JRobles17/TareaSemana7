package pe.edu.upn.tdd;

import java.util.ArrayList;
import java.util.List;

public class CribaDeEratostenes {

    public static List<Integer> calcula(int n) {
        List<Integer> primos = new ArrayList<>();
        if (n >= 2) {
            primos.add(2);
        }
        return primos;
    }

    static List<Boolean> creaListaDeNumerosSinMarcar(int n) {
        List<Boolean> marcados = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            marcados.add(false);
        }
        return marcados;
    }

    static void marcarMultiplos(List<Boolean> marcados) {
        for (int num = 2; num < marcados.size(); num++) {
            for (int mul = num * 2; mul < marcados.size(); mul += num) {
                marcados.set(mul, true);
            }
        }
    }
}
