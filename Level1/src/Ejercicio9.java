import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = entrada.nextLine();
        System.out.print("Ingrese una letra para buscar cantidad de coincidencias en el texto: ");
        char letra = entrada.next().charAt(0);
        System.out.println(contadorLetras(texto, letra));
        entrada.close();
    }
    // No cuenta coincidencias de mayúscula o minúscula de la misma letra ingresada
    public static int contadorLetras(String texto, char letra) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) contador++;
        }
        return contador;
    }
}