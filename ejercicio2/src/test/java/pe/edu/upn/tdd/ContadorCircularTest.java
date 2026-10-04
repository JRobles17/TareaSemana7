package pe.edu.upn.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContadorCircularTest {

    private ContadorCircular porDefectoLimite1;
    private ContadorCircular deCincoEnCincoLimite12;

    @BeforeEach
    void setUp() {
        porDefectoLimite1 = new ContadorCircular(1);
        deCincoEnCincoLimite12 = new ContadorCircular(5, 5, 12);
    }

    @Test
    void contadorPorDefectoEmpiezaEnCero() {
        assertEquals(0, porDefectoLimite1.getValor());
    }

    @Test
    void contadorConValorInicialCincoEmpiezaEnCinco() {
        assertEquals(5, deCincoEnCincoLimite12.getValor());
    }

    @Test
    void incrementarContadorPorDefectoSumaUno() {
        porDefectoLimite1.incrementa();
        assertEquals(1, porDefectoLimite1.getValor());
    }

    @Test
    void incrementarContadorDeCincoEnCincoPasaDe5A10() {
        deCincoEnCincoLimite12.incrementa();
        assertEquals(10, deCincoEnCincoLimite12.getValor());
    }
}