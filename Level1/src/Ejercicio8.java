import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Edad: ");
        String edad = entrada.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.print("Direccion: ");
        String direccion = entrada.nextLine();
        System.out.println(Formato(nombre, apellido, direccion, ciudad, edad));
        entrada.close();
    }
    public static String Formato(String nombre, String apellido, String direccion, String ciudad, String edad) {
        return String.format("%s - %s - %s - %s %s", ciudad, direccion, edad, nombre, apellido);
    }
}