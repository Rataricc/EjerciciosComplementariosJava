/*
    2 - Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero
    al principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista
    y el tamaño de la misma (antes y después de agregar a en la primera y última posición).
 */


import java.util.ArrayList;

public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(21);
        num.add(26);
        num.add(7);
        num.add(32);
        num.add(81);
        for (int i : num){
            System.out.println(i);
        }
        System.out.println("La lista es de: " + num.size());
        num.add(0,75);
        num.add(46);
        for (int i :
             num) {
            System.out.println(i);
        }
        System.out.println("La lista es de: " + num.size());
    }
}
