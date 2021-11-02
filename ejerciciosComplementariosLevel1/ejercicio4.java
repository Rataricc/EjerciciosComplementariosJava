/*
    4 - Realizar un programa que calcule el factorial de un número:
    n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int fac = 1;
        System.out.println("Importante: Si introduce un numero mayor 33 el factorial le dara como resultado 0.");
        System.out.println("Introdusca un numero para calcular su factorial: ");
        num = entrada.nextInt();
        for (int i = num; i > 0; i--){
            fac = fac*i;
        }
        System.out.println("El Factorial del numero " + num + " es de " + fac);
    }
}
// Nota el numero maximo para calcular el factorial es el 33, ya el 34 da 0