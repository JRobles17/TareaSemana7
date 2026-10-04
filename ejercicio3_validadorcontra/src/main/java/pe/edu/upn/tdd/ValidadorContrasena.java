package pe.edu.upn.tdd;

import java.util.ArrayList;
import java.util.List;

public class ValidadorContrasena {
    
    public static List<String> validar(String clave) {
        List<String> errores = new ArrayList<>();
        if (clave.length() < 8) {
            errores.add("Debe tener al menos 8 caracteres");
        }
        if (clave.chars().noneMatch(Character::isUpperCase)) {
            errores.add("Debe tener al menos una mayúscula");
        }
        return errores;
    }

}
