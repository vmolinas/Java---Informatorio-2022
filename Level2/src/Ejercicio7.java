import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera;
        do {
            try {
                bandera = false;
                System.out.print("Ingrese el primer número: ");
                int inicio = entrada.nextInt();
                System.out.print("Imgrese el segundo número mayor al primero: ");
                int fin = entrada.nextInt();
                int[] list = crearLista(inicio, fin);
                fizzBuzzFuncion(list);
        entrada.close();
            } catch (Exception e) {
                System.out.println("ERROR! Debe ingresar un número entero. El segundo mayor al primer ingresado.");
                bandera = true;
                entrada.nextLine();
            }
        } while (bandera); 
    }
    public static int[] crearLista(int inicio, int fin) {
        int finDeLaLista = fin - inicio;
        int[] arr = new int[finDeLaLista];

        for (int i = inicio; i < fin; i++) {
            arr[i-inicio] = i;
        }
        return arr;
    }
    public static void fizzBuzzFuncion(int[] lista) {
        String[] contador = new String[lista.length];
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] % 2 == 0 && lista[i] % 3 == 0){
                contador[i] = "FizzBuzz";
            }else if (lista[i] % 2 == 0) {
                contador[i] = "Fizz";
            }else if (lista[i] % 3 == 0){
                contador[i] = "Buzz";
            }else{
                contador[i] = ""+lista[i];
            }
        }
        for (int i = 0; i < contador.length; i++) {
            System.out.print(contador[i] + " ");
        }
    }
}