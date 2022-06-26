import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        boolean bandera;
        do {
            try {
                bandera = false;
                System.out.print("Ingrese el primer número: ");
                int numero1 = entrada.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int numero2 = entrada.nextInt();
                System.out.println(numero1 + " * " + numero2 + " = " + multiplicarSumando(numero1, numero2));
                entrada.close();
            } catch (Exception e) {
                System.out.println("ERROR! Debe ingresar un número entero");
                bandera = true;
                entrada.nextLine();
            }
        } while (bandera);
    }
    public static int multiplicarSumando(int numero1, int numero2) {
        int resultado = 0;
            if (numero1>numero2) {
                for (int i = 1; i <= numero2; i++) {
                    resultado += numero1;
                }
            } else{
                for (int i = 1; i <= numero1; i++) {
                    resultado += numero2;
                }
            }
        return resultado;
    }
}