/*
    1 - Dada una lista que contiene valores de tipo String,
    se deberá filtrar todos los valores que NO sean null o vacío ("").
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        palabras.add("no");
        palabras.add("");
        palabras.add(null);
        palabras.add("lo");
        palabras.add("se");
        palabras.add("");
        palabras.add(null);
        palabras.add("tu");
        palabras.add("");
        palabras.add("dime");

        List<String> filtroDePalabras = palabras.stream().filter(Objects::nonNull).filter(p -> !p.equals(""))
                .collect(Collectors.toList());
        System.out.println(filtroDePalabras);
    }
}
