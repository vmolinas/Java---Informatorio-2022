import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> listaPalabras = new ArrayList<>();
        rellenar(listaPalabras);
        System.out.println("Entrada:");
        listaPalabras.forEach(x -> System.out.println(x));
        System.out.println("Salida:");
        listaPalabras.stream()
                    .filter(text -> !(text==null) && (!("").equals(text)))
                    .collect(Collectors.toList())
                    .forEach(x-> System.out.println(x));;
    }
    public static void rellenar(List<String> palabra) {
        palabra.add("Hola");
        palabra.add(null);
        palabra.add("Informatorio");
        palabra.add("");
    }
}