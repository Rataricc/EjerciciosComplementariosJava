/*
    5 - Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre y fechaDeNacimiento
    (con tipos: String, String y LocalDate). Se desea generar un Map<String, Integer> donde la clave de Map
    será el apellido concatenado con el nombre (con separador de espacio en blanco) y el value la edad del alumno.
        * La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y
        demostrar su funcionamiento.
        * En ejemplo se muestra solo con 1 Alumno a modo de abreviar.
        * En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá usar
        otra tecnica de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc)
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)),
                new Alumno("Capitan", "America", LocalDate.of(1956, 5, 12)),
                new Alumno("Sopla", "Nuca", LocalDate.of(1990, 2, 10)),
                new Alumno("Lionel", "Messi", LocalDate.of(2001, 3, 30)),
                new Alumno("Rodrigo", "De Paul", LocalDate.of(1954, 2, 5)),
                new Alumno("Belen", "Carabajal", LocalDate.of(1945, 7, 21)),
                new Alumno("Elver", "Galarga", LocalDate.of(1911, 11, 11)),
                new Alumno("Ever", "Banegas", LocalDate.of(2010, 6, 9)));
        Map<String, Integer> anosDeAlumnos = alumnos.stream().collect(Collectors.
                toMap(p-> (p.getNombre() + " " + p.getApellido()),
                        p -> Ejercicio5.getEdad(p.getAnos())));
        System.out.println(anosDeAlumnos);
    }

    public static Integer getEdad(LocalDate anos){
        return Period.between(anos, LocalDate.now()).getYears();
    }
}

