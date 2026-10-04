package pe.edu.upn.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

    @ParameterizedTest(name = "convertir({0}) = {1}")
    @CsvSource({
        "1, 1",
        "2, 2",
        "3, Fizz",
        "5, Buzz",
        "6, Fizz",
        "10, Buzz",
        "15, FizzBuzz"
    })
    void convierteCorrectamente(int n, String esperado) {
        assertEquals(esperado, FizzBuzz.convertir(n));
    }

    @ParameterizedTest(name = "convertir({0}) lanza excepción")
    @ValueSource(ints = {0, -3})
    void noPositivoLanzaExcepcion(int n) {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.convertir(n));
    }
}