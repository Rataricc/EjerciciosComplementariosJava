/*
    Ejercicio 5: Clase Alumno:
 */

import java.time.LocalDate;

public class Alumno {
    private String nombre, apellido;
    private LocalDate anos;

    public Alumno(String entNombre, String entApellido, LocalDate entAnos){
        this.nombre = entNombre;
        this.apellido = entApellido;
        this.anos = entAnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getAnos() {
        return anos;
    }

    public void setAnos(LocalDate anos) {
        this.anos = anos;
    }
}
