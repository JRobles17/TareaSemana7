package pe.edu.upn.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

public class CribaDeEratostenesTest {
    @Test
    void calculaConUnoDevuelveListaVacia() {
        List<Integer> primos = CribaDeEratostenes.calcula(1);
        assertTrue(primos.isEmpty());
    }
}
