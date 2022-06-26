import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String salida = "";
        boolean bandera;
        do {
            try {
                bandera = false;
                System.out.print("Ingrese un número para empezar: ");
                int numero = entrada.nextInt();
                System.out.println("-----------------------------------");
                for (int i = 1; i <= numero; i++){
                    salida += i;
                    System.out.println(salida);
                }
            } catch (Exception e) {
                System.out.println("ERROR! Debe ingresar un número entero");
                bandera = true;
                entrada.nextLine();
            }  
        } while (bandera);
        entrada.close();
    }
}