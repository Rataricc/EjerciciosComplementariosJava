/*
    3 - Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa
    (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir,
    imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 */

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> baraja = new ArrayList<>(20);
        baraja.add(2);
        baraja.add(3);
        baraja.add(4);
        baraja.add(5);
        baraja.add(6);
        baraja.add(7);
        baraja.add(8);
        baraja.add(9);
        baraja.add(10);
        baraja.add(11);
        baraja.add(12);
        baraja.add(13);
        baraja.add(14);
        System.out.println("Inicio ordenado:");
        for (int i : baraja){
            System.out.println(i);
        }
        System.out.println("La baraja tiene: "+baraja.size()+ " Cartas \n");
        System.out.println("Inicio al reves: ");
        Collections.reverse(baraja);
        for (int i : baraja){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Cartas mezcladas: ");
        Collections.shuffle(baraja);
        for (int i : baraja){
            System.out.println(i);
        }
    }
}
