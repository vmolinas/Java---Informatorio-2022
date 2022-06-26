import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> listaB = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        int empiezaB = (int)listaB.stream()
            .filter(p-> p.toLowerCase().charAt(0)=='b')
            .count();
        System.out.println("List: ");
        listaB.forEach(p-> System.out.println("\t"+p));
        System.out.println("Total palabras empiezan en B/b: " + empiezaB);
    }
}