/*
    3 - Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números
    (incrementos de 1) de la siguiente forma:
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entero");
        num = entrada.nextInt();
        for (int i = 1; i <= num; i++){
            for (int j = 1; j < i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}