/*
    3 - Se dispone de una lista de Strings, de la cual saber la cantidad de valores que comiencen con la letra B
    (tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase).
 */

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> listaSuper = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "Brainiac");
        Long cont = listaSuper.stream().filter(p -> p.startsWith("B") || p.startsWith("b")).count();
        System.out.println(cont);
    }
}
