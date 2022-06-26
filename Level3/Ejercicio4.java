import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        List<Integer> restultNumeros = numeros.stream()
                                .map(n -> factorial(n))
                                .distinct()
                                .collect(Collectors.toList());
        System.out.println("Entrada:");
        numeros.forEach(n-> System.out.println(n));
        System.out.println("Salida:");
        restultNumeros.forEach(n-> System.out.println(n));
    }
    public static int factorial(int numero) {
        if(numero == 1) return 1;
        return numero * factorial(numero-1);
    }
}