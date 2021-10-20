/*
    6 - Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia
    (sin uso de librerías).
 */

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base,exponente, resultado = 1;
        System.out.println("Introdusca la base: ");
        base = entrada.nextInt();
        System.out.println("Introdusca el exponente: ");
        exponente = entrada.nextInt();
        for (int i = 1; i <= exponente; i++){
            resultado *= base;
        }
        System.out.println(base + " elevado " + exponente + " = " + resultado);
    }
}
