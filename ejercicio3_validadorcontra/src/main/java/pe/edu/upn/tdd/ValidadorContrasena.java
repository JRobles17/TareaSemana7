package pe.edu.upn.tdd;

import java.util.ArrayList;
import java.util.List;

public class ValidadorContrasena {

    static final int LONGITUD_MINIMA = 8;
    static final String ERROR_LONGITUD = "Debe tener al menos 8 caracteres";
    static final String ERROR_MAYUSCULA = "Debe tener al menos una mayúscula";
    static final String ERROR_DIGITO = "Debe tener al menos un dígito";

    public static List<String> validar(String clave) {
        if (clave == null) {
            throw new IllegalArgumentException("La clave no puede ser null");
        }
        List<String> errores = new ArrayList<>();
        if (clave.length() < LONGITUD_MINIMA) {
            errores.add(ERROR_LONGITUD);
        }
        if (clave.chars().noneMatch(Character::isUpperCase)) {
            errores.add(ERROR_MAYUSCULA);
        }
        if (clave.chars().noneMatch(Character::isDigit)) {
            errores.add(ERROR_DIGITO);
        }
        return errores;
    }
}