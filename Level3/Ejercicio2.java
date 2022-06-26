import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(3, 5, 7, 11, 73);
        List<Integer> resultado = numeros.stream()
                                    .map(x-> (int) Math.pow(x, 2))
                                    .collect(Collectors.toList());
        System.out.println("Número:");
        numeros.forEach(n-> System.out.print(n + " "));
        System.out.println("\nResultado de hacer el cuadrado:");
        resultado.forEach(n-> System.out.print(n + " "));
    }
}