import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera;
        List<Integer> numero = new ArrayList<Integer>();
        int nuevo;
        System.out.println("Ingrese 5 números enteros.");
        do {
            try {
                bandera = false;
                for (int i = 0; i<5;i++){
                    System.out.print("Número " + (i+1) + ": ");
                    numero.add(entrada.nextInt());
                }
            } catch (Exception e) {
                System.out.println("ERROR! Debe ingresar un número entero.");
                bandera = true;
                entrada.nextLine();
            }
        } while (bandera);
        System.out.println("Lista actual de números: ");
        Mostrar(numero);
        do {
            try {
                bandera = false;
                System.out.print("Número al principio: ");
                nuevo = entrada.nextInt();
                insertPrincipio(numero, nuevo);
                System.out.print("Número al final: ");
                nuevo = entrada.nextInt();
                insertFinal(numero, nuevo);
            } catch (Exception e) {
                System.out.println("ERROR! Debe ingresar un número entero.");
                bandera = true;
                entrada.nextLine();
            }
        } while (bandera);
        entrada.close();
        System.out.print("Lista actualizada: ");
        Mostrar(numero);
    }
    public static void insertPrincipio(List<Integer> lista, int nuevo) {
        lista.add(0, nuevo);
    }
    public static void insertFinal(List<Integer> lista, int numero) {
        lista.add(lista.size(), numero);
    }
    public static void Mostrar(List<Integer> lista){
        for (Integer numero : lista) {
            System.out.print(numero + " ");
        }
        System.out.println("");
    }
}