import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombre de usuario: ");
        String usuario = entrada.nextLine();
        System.out.println("HOLA " + usuario);
        entrada.close();
    }  
}