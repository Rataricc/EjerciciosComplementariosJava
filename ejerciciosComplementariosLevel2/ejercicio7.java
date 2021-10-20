/*
    7 - Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo),
    nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final.
    Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz”
    y si es a la vez múltiplo de ambos colocara “FizzBuzz”.
    Observacion: Los 2 argumentos indican con que valor se arranca a calcular
    y el segundo con qué valor debe frenar (no se incluye en el cálculo)
    Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio7 {
    ArrayList lista = new ArrayList();
    int num1;
    int num2;
    public boolean esValido(int num1, int num2, boolean band) {
        if (num1 > num2) {
            band = false;
            return band;
        } else {
            band = true;
            return band;
        }
    }
    public void lista(int num1, int num2) {
        for (int i = num1; i < (num2); i++) {
            if (i % 2 == 0 && i % 3 != 0) {
                lista.add("Fizz");
            } else if (i % 2 != 0 && i % 3 == 0) {
                lista.add("Buzz");
            } else if (i % 2 == 0 && i % 3 == 0) {
                lista.add("FizzBuzz");
            } else {
                lista.add(i);
            }
        }
    }
    public void mostrarLista() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ejercicio7 numero = new ejercicio7();
        int num1;
        int num2;
        boolean band = false;
        do{
            System.out.println("Ingresa primer numero:");
            num1 = entrada.nextInt();
            System.out.println("Ingresa segundo numero:");
            num2 = entrada.nextInt();
            band = numero.esValido(num1, num2, band);
            if (band == false){
                System.out.println("El primer numero debe ser menor que el segundo");
            }
        }while (band == false);
        numero.lista(num1, num2);
        numero.mostrarLista();
    }
}