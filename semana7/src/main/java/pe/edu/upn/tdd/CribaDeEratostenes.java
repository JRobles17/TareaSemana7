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
    
}
