package pe.edu.upn.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ContadorCircularTest {
    
    @Test
    void contadorPorDefectoEmpiezaEnCero() {
        ContadorCircular contador = new ContadorCircular(10);
        assertEquals(0, contador.getValor());
    }
    
    @Test
    void contadorConValorInicialCincoEmpiezaEnCinco() {
        ContadorCircular contador = new ContadorCircular(5, 5, 12);
        assertEquals(5, contador.getValor());
    }
}
