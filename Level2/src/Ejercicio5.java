import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> pagoxHoras = new ArrayList<>();
        cantidadHoras(horasTrabajadas);
        costoHora(pagoxHoras);
        System.out.print("Horas trabajadas: ");
        System.out.println(horasTrabajadas);
        System.out.print("Pago por Horas: ");
        System.out.println(pagoxHoras);
        System.out.print("Pago Final: ");
        System.out.println(calculoTotalPorDia(horasTrabajadas, pagoxHoras));
        System.out.println("Total a Cobrar: $" + calcularPrecioTotal(calculoTotalPorDia(horasTrabajadas, pagoxHoras))); 
    }
    public static List<Integer> calculoTotalPorDia(List<Integer> horas, List<Integer> precios) {
        ArrayList<Integer> fullPrice = new ArrayList<>();
        horas.forEach(contenido -> {
            int result = contenido * precios.get(horas.indexOf(contenido)) ;
            fullPrice.add(result);
        });
        return fullPrice;
    }
    public static int calcularPrecioTotal(List<Integer> lista) {
        int resultado = 0;
        for (Integer contenido : lista) {
            resultado += contenido;
        }
        return resultado;
    }
    public static void cantidadHoras(List<Integer> lista){
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(4);
        lista.add(5);
    }
    public static void costoHora(List<Integer> lista){
        lista.add(350);
        lista.add(345);
        lista.add(550);
        lista.add(600);
        lista.add(320);
    }
}