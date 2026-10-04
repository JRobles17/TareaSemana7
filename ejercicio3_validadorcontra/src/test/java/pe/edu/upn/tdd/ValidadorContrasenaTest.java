package pe.edu.upn.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ValidadorContrasenaTest {
    
    @Test
    void claveValidaNoTieneErrores() {
        assertTrue(ValidadorContrasena.validar("Segura123").isEmpty());
    }

    @Test
    void claveCortaDevuelveErrorDeLongitud() {
        assertEquals(List.of("Debe tener al menos 8 caracteres"),
                ValidadorContrasena.validar("Abc1"));
    }

    @Test
    void claveSinMayusculaDevuelveError() {
        assertEquals(List.of("Debe tener al menos una mayúscula"),
                ValidadorContrasena.validar("segura123"));
    }

    @Test
    void claveSinDigitoDevuelveError() {
        assertEquals(List.of("Debe tener al menos un dígito"),
                ValidadorContrasena.validar("SeguraSinNum"));
    }
    
}
