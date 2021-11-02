/*
    5 - Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas
    (sin uso de librerías).
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1,num2,sum = 0;
        System.out.println("Ingrese dos numeros enteros para sacar el producto mediante sumas sucesivas.");
        System.out.println("Ingrese un numero por favor: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();
        for (int i = 1; i <= num2; i++){
           sum = sum + num1;
       }
        System.out.println("El Resultado del producto de " + num1 + " * " + num2 + " es de: " + sum);
    }
}
