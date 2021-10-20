/*
   2 - Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma,
    resta, multiplicación, división y módulo (resto de la división) de ambos números.
 */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2;
        double resultado;
        System.out.println("Ingrese un numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2 = entrada.nextDouble();
        resultado = num1 + num2;
        System.out.println("El resultado de la suma de " + num1 +" + "+ num2 + " es: "+ resultado);
        resultado = num1 - num2;
        System.out.println("El resultado de la resta de " + num1 +" - "+ num2 + " es: "+ resultado);
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicacion de " + num1 +" * "+ num2 + " es: "+ resultado);
        if (num2 > 0){
            resultado = num1 / num2;
            System.out.println("El resultado de la division de " + num1 +" '/' "+ num2 + " es: "+ resultado);
        }else{
            System.out.println("No se puede dividir por 0");
        }
        if (num2 > 0){
            resultado = num1 % num2;
            System.out.println("El resto de la division de " + num1 +" % "+ num2 + " es: "+ resultado);
        }else{
            System.out.println("Esta division no tiene resto y no se puede dividir por 0.");
        }
        //resultado = num1 % num2;
        //System.out.println("El resto de la division es de: " + resultado);
    }
}