/*
    5 - Dados 2 ArrayList que contienen horas-trabajadas (array1)
    y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado.
    Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
 */

import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> horasTrabajadas = new ArrayList<>();
        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        ArrayList<Integer> valorPorHora = new ArrayList<>();
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);
        System.out.println("Valor por horas trabajadas: $" + valorPorHora);
        ArrayList<Integer> totales = new ArrayList<>();
        for (int i =  0; i < horasTrabajadas.size(); i++){
            int tota = horasTrabajadas.get(i) * valorPorHora.get(i);
            totales.add(tota);
        }
        int ths = 0;
        for (int tota:
             totales) {
            ths = ths + tota;
        }
        System.out.println("Valores totales por horas trabajadas: $" + totales);
        System.out.println("El total final es de: $" + ths);
    }
}