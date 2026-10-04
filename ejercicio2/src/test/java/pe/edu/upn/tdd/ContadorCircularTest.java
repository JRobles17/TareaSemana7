package pe.edu.upn.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ContadorCircularTest {
    
    @Test
    void contadorPorDefectoEmpiezaEnCero() {
        ContadorCircular contador = new ContadorCircular(10);
        assertEquals(0, contador.getValor());
    }
}
