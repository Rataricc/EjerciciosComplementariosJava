/*
   1 - Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”
 */

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario por favor: ");
        String usuario;
        usuario = entrada.nextLine();
        System.out.println("Hola " + usuario);
    }
}
