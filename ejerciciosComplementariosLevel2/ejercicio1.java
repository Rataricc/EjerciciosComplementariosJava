/*
    1 - Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina,
     luego imprimir por pantalla el ranking.
 */

import java.util.ArrayList;

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("#1 - Bariloche");
        ciudades.add("#2 - Cordoba");
        ciudades.add("#3 - Resistencia");
        for (String i : ciudades){
            System.out.println(i);
        }
    }
}
