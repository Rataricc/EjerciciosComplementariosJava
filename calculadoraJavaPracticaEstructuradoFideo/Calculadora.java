import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("            Calculadora de dos numeros");
        int opcion;
        do {
            System.out.println("Introdusca un numero para realizar dicha operacion: ");
            ArrayList<String> numeros = new ArrayList<>();
            numeros.add("1 - Sumar");
            numeros.add("2 - Restar");
            numeros.add("3 - Multiplicar");
            numeros.add("4 - Dividir");
            for (String i:
                 numeros) {
                System.out.println(i);
            }
            System.out.println("Si decea salir apriete cualquier numero superior a 5.");
            while (!entrada.hasNextInt()){
                String teclado = entrada.nextLine();
                System.out.println(teclado + " Es un dato incorrecto. Intentelo nuevamente.");
            }
            opcion = entrada.nextInt();
        }while (opcion == 5);
        if (opcion == 1){
            System.out.println("Usted eligio hacer una suma");
            double num1;
            do {
                System.out.println("Introdusca el primer numero: ");
                while (!entrada.hasNextDouble()){
                    String teclado = entrada.next();
                    System.out.println(teclado + " Es un dato incorrecto.Intentelo nuevamente.");
                }
                num1 = entrada.nextDouble();
            }while (num1 < 0 );
            double num2;
            do {
                System.out.println("Introdusca el segundo numero: ");
                while (!entrada.hasNextDouble()){
                    String teclado = entrada.next();
                    System.out.println( teclado + " Es un dato incorrecto.Intentelo nuevamente.");
                }
                num2 = entrada.nextDouble();
            }while (num2 < 0);
            double resultado = num1 + num2;
            System.out.println("El resultado de la suma de: " + num1 + " + " + num2 + " es de = " + resultado);
        }else if (opcion == 2){
            System.out.println("Usted eligio realizar una Resta");
            double num1;
            do {
                System.out.println("Introdusca el primer numero: ");
                while (!entrada.hasNextDouble()){
                    String teclado = entrada.nextLine();
                    System.out.println(teclado + " Es un dato incorrecto.Intentelo nuevamente.");
                }
                num1 = entrada.nextDouble();
            }while (num1 < 0);
            double num2;
            do {
                System.out.println("Introdusca el segundo numero: ");
                while (!entrada.hasNextDouble()){
                    String teclado = entrada.nextLine();
                    System.out.println(teclado + " Es un dato incorrecto.Intentelo nuevamente.");
                }
                num2 = entrada.nextDouble();
            }while (num2 < 0);
            double resultado = num1 - num2;
            System.out.println("El resultado de la resta de: " + num1 + " - " + num2 + " es de = " + resultado);
        }else if (opcion == 3){
            System.out.println("Usted eligio hacer una mulitiplicacion");
            double num1;
            do {
                System.out.println("Introdusca el primer numero: ");
                while (!entrada.hasNextDouble()){
                    String teclado = entrada.nextLine();
                    System.out.println(teclado + " Es un dato incorrecto.Intentelo nuevamente.");
                }
                num1 = entrada.nextDouble();
            }while (num1 < 0);
            double num2;
            do {
                System.out.println("Introdusca el segundo numero: ");
                while (!entrada.hasNextDouble()){
                    String teclado = entrada.nextLine();
                    System.out.println(teclado + " El dato es incorrecto.Intentelo nuevamente.");
                }
                num2 = entrada.nextDouble();
            }while (num2 < 0);
            double resultado = num1 * num2;
            System.out.println("El resultado de la multiplicacion de: " + num1 + " X " + num2 + " es de = " +
                                resultado);
        }else if (opcion == 4){
            System.out.println("Usted eligio hacer una division");
            double num1;
            do {
                System.out.println("Introdusca el primer numero: ");
                while (!entrada.hasNextDouble()){
                    String teclado = entrada.next();
                    System.out.println(teclado + " Es un dato incorrecto.Intentelo nuevamente.");
                }
                num1 = entrada.nextDouble();
            }while (num1 < 0);
            double num2;
            do {
                System.out.println("Introdusca el segundo numero: ");
                while (!entrada.hasNextDouble()) {
                    String teclado = entrada.next();
                    System.out.println(teclado + " Es un dato incorrecto.Intentelo nuevamente.");
                }
                num2 = entrada.nextDouble();
            }while (num2 < 0);
            if (num2 == 0) {
                System.out.println("No se puede dvividir entre cero");
            }else{
                double resultado = num1 / num2;
                System.out.println("El resultado de la division de: " + num1 + " / " + num2 + " es de = "+ resultado);
            }
        }else {
            System.out.println("Usted decidio salir");
        }
    }
}
