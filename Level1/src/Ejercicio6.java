import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        boolean bandera;
        do {
            try {
                bandera = false;
                System.out.print("Ingrese número base: ");
                int base = entrada.nextInt();
                System.out.print("Ingrese el exponente: ");
                int exponente = entrada.nextInt();
                System.out.println(base + " elevado a " + exponente + " = " + Potencia(base, exponente));
            } catch (Exception e) {
                System.out.println("ERROR! Debe ingresar un número entero");
                bandera = true;
                entrada.nextLine();
            }
        } while (bandera);
        entrada.close();
    }
    public static int Potencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}