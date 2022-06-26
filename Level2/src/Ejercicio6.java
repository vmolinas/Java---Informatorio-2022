import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<>();
        System.out.println("Cargar empleados");
        listaEmpleados(empleados);
        printList(empleados);
        Map<Integer, Integer> salarios = calcularSalario(empleados);
        for (Map.Entry<Integer, Integer> employee : salarios.entrySet()) {
            System.out.println(String.format(
                "DNI: %d | Salario: $%d", 
                employee.getKey(), employee.getValue())
            );
        }
    }
    public static void listaEmpleados(Set<Empleado> set) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String condicion;
        while (bandera) {
            System.out.print("Nombre y Apellido: ");
            String nombreCompleto = entrada.nextLine();
            System.out.print("DNI sin puntos: ");
            int dni = entrada.nextInt();
            System.out.print("Horas Trabajadas: ");
            int horasTrabajadas = entrada.nextInt();
            System.out.print("Valor por hora: ");
            int precioPorHora = entrada.nextInt();
            set.add(new Empleado(nombreCompleto, dni, horasTrabajadas, precioPorHora));

            System.out.print("Cargar otro empleado? (s/n): ");
            condicion = entrada.nextLine();
            if (condicion!="s"){
                bandera = false;
            }
        }
        entrada.close();
    }
    public static Map<Integer, Integer> calcularSalario(Set<Empleado> set) {
        Map<Integer, Integer> salaries = new HashMap<>();
        set.forEach(emp ->{
            int salario = emp.getPrecioPorHora()*emp.getHorasTrabajadas();
            salaries.put(emp.getDni(), salario);
        });
        return salaries;
    }
    public static void printList(Set<Empleado> set) {
        for (Empleado empleado : set) {
            System.out.println(empleado);
        }
    }
}
class Empleado{
    private String nombreCompleto;
    private int dni;
    private int horasTrabajadas;
    private int precioPorHora;
    public Empleado(String nombreCompleto, int dni, int horasTrabajadas, int precioPorHora) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.precioPorHora = precioPorHora;
    }
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }
    public void setnombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public int getDni() {
        return this.dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public int getHorasTrabajadas() {
        return this.horasTrabajadas;
    }
    public void sethorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public int getPrecioPorHora() {
        return this.precioPorHora;
    }
    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }
    @Override
    public String toString() {
        return String.format(
            "%s %d  %d  $%d", 
            getNombreCompleto(), getDni(), getHorasTrabajadas(), getPrecioPorHora()
        );
    }
}