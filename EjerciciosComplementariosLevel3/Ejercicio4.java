/*
    4 - Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando la
    operación de factorial pero no se desean valores repetidos.
 */

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> lista1 = List.of(1, 2, 4, 4, 4);
        List<Integer> lista2 = lista1.stream().map(p -> Ejercicio4.calcularFactorial(p)).distinct()
                .collect(Collectors.toList());
        System.out.println(lista2);
    }
    public static Integer calcularFactorial(Integer numero) {
        if (numero == 1){
            return 1;
        }else {
            return numero * calcularFactorial(numero-1);
        }
    }
}

