import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        final int Cartas = 13;
        List<Integer> cartasEspanol = new ArrayList<>();
        for (int i = 1; i <= Cartas; i++) {
            cartasEspanol.add(i);
        }
        System.out.print("Cartas: ");
        printList(cartasEspanol);
        System.out.print("Cartas invertidas: ");
        printRever(cartasEspanol);
        System.out.print("Cartas desordenadas: ");
        printDesord(cartasEspanol);
    }
    public static void printList(List<Integer> lista) {
        for (Integer carta : lista) {
            System.out.print(carta + " ");
        }
        System.out.println();
    }
    public static void printRever(List<Integer> lista){
        List<Integer> listaAux = lista;
        Collections.reverse(listaAux);
        printList(listaAux);
    }
    public static void printDesord(List<Integer> lista) {
        List<Integer> listaAux = lista;
        Collections.shuffle(listaAux);
        printList(listaAux);
    }
}