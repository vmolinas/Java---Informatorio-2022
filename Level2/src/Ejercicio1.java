import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        List<String> ciudades = new ArrayList<>();

        System.out.println("Ingresa tu Top 3 de Ciudades de Argentina");
        for (int i = 0; i<3;i++){
            System.out.print("Ciudad " + (i+1) + ": ");
            ciudades.add(entrada.nextLine());
        }
        Ranking(ciudades);
        entrada.close();
    }
    public static void Ranking(List<String> ciudades) {
        for (String ciudad : ciudades) {
            System.out.println("#" +(ciudades.indexOf(ciudad)+1) + " - "  + ciudad);
        }
    }
}