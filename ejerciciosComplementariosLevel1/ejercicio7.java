/*
    7 - Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas.
    Sin uso de métodos o librerías que realicen toUppercase().Pero tambien hacerlo con ese metodo.
    por algo existen los metodos y las librerias.
 */

/*
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println("Introdusca una frase cualquiera o su nombre en minusculas, para convertirlos \n" +
                "a mayusculas.");
        frase = entrada.nextLine();
        System.out.println(frase.toUpperCase());
    }
}
 */
import java.util.Scanner;

public class Ejercicio7 {
    static String minAMayuscula(String caracter) {
        String result = "";
        char texto = ' ';
        for (int i = 0; i < caracter.length(); i++) {
            if (caracter.charAt(i) >= 'a' && caracter.charAt(i) <= 'z') {
                texto = (char) (caracter.charAt(i) - 32);
            } else {
                texto = (char) (caracter.charAt(i));
            }
            result += texto;
        }
        return result;
    }

    public static void main(String[] args) {
        String mayuscula;
        Scanner text = new Scanner(System.in);
        System.out.println("Ingrese su palabra en minuscula: ");
        mayuscula = text.nextLine();
        System.out.println(minAMayuscula(mayuscula));
    }
}
