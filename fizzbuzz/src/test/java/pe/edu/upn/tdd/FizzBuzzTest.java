package pe.edu.upn.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void convertirUnoDevuelveUno() {
        assertEquals("1", FizzBuzz.convertir(1));
    }

    @Test
    void convertirDosDevuelveDos() {
        assertEquals("2", FizzBuzz.convertir(2));
    }

    @Test
    void convertirTresDevuelveFizz() {
        assertEquals("Fizz", FizzBuzz.convertir(3));
    }


}
