package pe.edu.upn.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

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

    @Test
    @Disabled("Pendiente: se activará al terminar el algoritmo")
    void calculaConTres() {
        assertEquals(List.of(2, 3), CribaDeEratostenes.calcula(3));
    }

    @Test
    void creaListaDeNumerosSinMarcarTieneTopeMasUnoElementosEnFalse() {
        List<Boolean> marcados = CribaDeEratostenes.creaListaDeNumerosSinMarcar(4);

        assertEquals(5, marcados.size());
        assertTrue(marcados.stream().noneMatch(m -> m));
    }
}
