import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        boolean bandera;
        do {
            try {
                bandera = false;
                System.out.print("Ingresa el numero: ");
                int numero = entrada.nextInt();
                System.out.println("El factorial de " + numero + " es: " + Factorial(numero));
                entrada.close();
            } catch (Exception e) {
                System.out.println("ERROR! Debe ingresar un número entero");
                bandera = true;
                entrada.nextLine();
            }
        } while (bandera);
    }
    public static int Factorial(int numero) {
        if (numero == 1) return 1;
        return numero * Factorial(numero-1);
    }
}