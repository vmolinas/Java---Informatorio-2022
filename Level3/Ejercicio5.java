import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.Period;

public class Ejercicio5 {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        List<Estudiante> alumno = new ArrayList<>();
        rellenar(alumno);
        Map<String, Integer> map = alumno.stream()
                            .collect(Collectors.toMap(x-> x.getApellido()+" "+x.getNombre(), 
                            x-> Period.between(x.getFechaDeNacimiento(), fechaActual).getYears()));
        System.out.println("Lista de Alumnos:");
        alumno.forEach(s-> System.out.println(s));
        System.out.println("Alumnos y edad:");
        map.forEach((k,v) -> System.out.println(k +": " + v + " años"));
    }
    public static void rellenar(List<Estudiante> lista) {
        lista.add(new Estudiante("Pineda", "Ada", LocalDate.of(1990, 5, 14)));
        lista.add(new Estudiante("Diaz", "Arturo", LocalDate.of(1989, 2, 5)));
        lista.add(new Estudiante("Sanchez", "Mizael", LocalDate.of(1991, 3, 14)));
        lista.add(new Estudiante("Brizuela", "Fatima", LocalDate.of(1990, 6, 28)));
        lista.add(new Estudiante("Vazquez", "Mariza", LocalDate.of(1992, 12, 12)));
    }
}
class Estudiante{
    private String apellido;
    private String nombre;
    private LocalDate fechaDeNaciomiento;
    public Estudiante(){ }
    public Estudiante(String apellido, String nombre, LocalDate fechaDeNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNaciomiento = fechaDeNacimiento;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNaciomiento;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNaciomiento = fechaDeNacimiento;
    }
    @Override
    public String toString() {
        return "{ "+ apellido + ", " + nombre + " - Fecha de Nacimiento: " + fechaDeNaciomiento + " }";
    }     
}