/*
    4 - Cargar un arrayList con 12 nombres de estudiantes (String),
    luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
 */


import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(20);
        nombres.add("Belen");
        nombres.add("Miguel");
        nombres.add("Lucas");
        nombres.add("Eduardo");
        nombres.add("Jose");
        nombres.add("Elias");
        nombres.add("Esteban");
        nombres.add("Rodrigo");
        nombres.add("Carla");
        nombres.add("Maria");
        nombres.add("Ezequiel");
        nombres.add("Marcela");
        for (String i:
             nombres) {
            System.out.println(i);
        }
        System.out.println("En la lista hay: " + nombres.size() + " nombres");
        List<String> curso1 = nombres.subList(0,4);
        List<String> curso2 = nombres.subList(4,8);
        List<String> curso3 = nombres.subList(8,12);
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
    }
}
