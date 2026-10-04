package pe.edu.upn.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class CribaDeEratostenesTest {
    @Test
    void calculaConUnoDevuelveListaVacia() {
        List<Integer> primos = CribaDeEratostenes.calcula(1);
        assertTrue(primos.isEmpty());
    }

    @Test
    void calculaConDos() {
        assertEquals(List.of(2), CribaDeEratostenes.calcula(2));
    }
}
