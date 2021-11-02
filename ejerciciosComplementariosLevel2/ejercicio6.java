/*
    6 - Se dispone de una colección de Empleados, de cada empleado se conoce:
        Nombre y Apellido
        DNI
        horasTrabajadas
        valorPorHora
        Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo
        (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) }
        donde la clave (key) es el dni y el valor (value) es el sueldo calculado.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
        String nombre,apellido;
        int dni,horasTrabajadas,valorPorHora;
        public Ejercicio6(String entNombre,
                          String entApellido,
                          int entDni,
                          int entHorasTrabajadas,
                          int entValorPorHora){
            this.nombre = entNombre;
            this.apellido = entApellido;
            this.dni = entDni;
            this.horasTrabajadas = entHorasTrabajadas;
            this.valorPorHora = entValorPorHora;
        }
    public int calcularSueldo(){
            return horasTrabajadas * valorPorHora;
    }
    @Override
    public String toString(){
            return "nombre: " + nombre + "apellido: " + apellido;
    }
    public static void main(String[] args) {
        Ejercicio6 empleado1 = new Ejercicio6("Cristiano","Ronaldo",41456789,
                4,1500);
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Apellido: " + empleado1.apellido);
        System.out.println("DNI: " + empleado1.dni);
        System.out.println("Horas Trabajadas: " + empleado1.horasTrabajadas);
        System.out.println("Valor por Hora: $" + empleado1.valorPorHora + "\n");
        Ejercicio6 empleado2 = new Ejercicio6("Lionel","Messi",40345652,6,
                3000);
        System.out.println("Nombre: " + empleado2.nombre);
        System.out.println("Apellido: " + empleado2.apellido);
        System.out.println("DNI: " + empleado2.dni);
        System.out.println("Horas Trabajadas: " + empleado2.horasTrabajadas);
        System.out.println("Valor por Hora: $" + empleado2.valorPorHora + "\n");
        Ejercicio6 empleado3 = new Ejercicio6("Roberto Carlos", "Da Silva",38567941,
                12,7000);
        System.out.println("Nombre: " + empleado3.nombre);
        System.out.println("Apellido: " + empleado3.apellido);
        System.out.println("DNI: " + empleado3.dni);
        System.out.println("Horas Trabajadas: " + empleado3.horasTrabajadas);
        System.out.println("Valor por Hora: $" + empleado3.valorPorHora + "\n");
        Set<Ejercicio6> empleado = new HashSet<>();
        empleado.add(empleado1);
        empleado.add(empleado2);
        empleado.add(empleado3);
        Map mapEmpleado = new HashMap();
        empleado.forEach(ejercicio6 -> {mapEmpleado.put(ejercicio6.dni,ejercicio6.calcularSueldo());});
        System.out.println(mapEmpleado);
    }
}