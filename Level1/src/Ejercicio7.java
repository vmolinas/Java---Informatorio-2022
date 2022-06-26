import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese una palabra en minúsculas: ");
        String palabra = entrada.next();
        System.out.println(enMayuscula(palabra));
        entrada.close();
    }
    // No se consideran que el usuario ingrese mayúsculas, números o caracteres especiales
    public static String enMayuscula(String palabra) {
        final int difAscii = 32;
        String salida = "";
        char letra;
        for (int i = 0; i < palabra.length(); i++) {
            letra = (char) (palabra.charAt(i) - difAscii);
            salida += letra;
        }
        return salida;
    }
}