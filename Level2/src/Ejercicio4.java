import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> estudiantes = new ArrayList<>();
        for (int i = 0; i<12;i++){
            System.out.print("Alumno " + (i+1) + ": ");
            estudiantes.add(entrada.nextLine());
        }
        System.out.println("Alumnos actuales:");
        Mostrar(estudiantes);
        System.out.println("Alumnos dividida en cursos:");
        separarList(estudiantes);
        entrada.close();
    }
    public static void Mostrar(List<String> lista) {
        for (String contenido : lista) {
            if (lista.indexOf(contenido) == lista.size()-1) {
                System.out.print(contenido);
            }else{
                System.out.print(contenido + " - ");
            }
        }
        System.out.println();
    }
    public static void separarList(List<String> lista) {

        List<String> curso1 = lista.subList(0, 4);
        List<String> curso2 = lista.subList(4, 8);
        List<String> curso3 = lista.subList(8, 12);
        Mostrar(curso1);
        Mostrar(curso2);
        Mostrar(curso3);
    }
}