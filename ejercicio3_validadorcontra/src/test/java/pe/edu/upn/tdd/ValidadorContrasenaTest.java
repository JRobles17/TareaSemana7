package pe.edu.upn.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class ValidadorContrasenaTest {
    
    @Test
    void claveValidaNoTieneErrores() {
        assertTrue(ValidadorContrasena.validar("Segura123").isEmpty());
    }
}
