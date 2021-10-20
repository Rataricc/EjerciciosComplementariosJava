/*
    7 - Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas.
    Sin uso de métodos o librerías que realicen toUppercase().Pero tambien hacerlo con ese metodo.
    por algo existen los metodos y las librerias.
 */


import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println("Introdusca una frase cualquiera o su nombre en minusculas, para convertirlos \n" +
                "a mayusculas.");
        frase = entrada.nextLine();
        System.out.println(frase.toUpperCase());
    }
}
