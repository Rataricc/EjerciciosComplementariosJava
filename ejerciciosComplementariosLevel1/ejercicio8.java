/*
    Crear una aplicación que solicite de entrada los datos de una persona en este orden:
        Nombre y Apellido
        Edad
        Dirección
        Ciudad
        Luego imprimirá el siguiente mensaje:
        {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        String direccion = " ";
        String ciudad = " ";
        System.out.println("Ingrese su nombre por favor: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su direccion: ");
        direccion = entrada.nextLine();
        System.out.println("Ingrese su ciudad: ");
        ciudad = entrada.next();
        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre + " " + apellido);
        System.out.println("Su ciudad es: " + ciudad);
        System.out.println("Su direccion: " + direccion);
        System.out.println("Su edad es: " + edad + " Años");
        System.out.println("Su nombre y apellido es: " + nombre + " " + apellido);

    }
}
