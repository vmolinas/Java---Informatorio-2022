import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean bandera;
        System.out.println("Ingrese dos número enteros para realizar algunas operaciones");
        do {
            try {
                bandera = false;
                System.out.print("Primer número: ");
                int num1 = entrada.nextInt();
                System.out.print("Segundo número: ");
                int num2 = entrada.nextInt();
                resolver(num1, num2);
                entrada.close();
            } catch (Exception e) {
                System.out.println("ERROR! Debe ingresar un número entero");
                bandera = true;
                entrada.nextLine();
            }
        } while (bandera);
    }
    public static void resolver(int num1, int num2) {
        System.out.println(String.format("%d + %d = %d", num1, num2, num1+num2));
        System.out.println(String.format("%d - %d = %d", num1, num2, num1-num2));
        System.out.println(String.format("%d * %d = %d", num1, num2, num1*num2));
        if (num2 == 0){
            System.out.println("No puedes dividir por CERO");
        }else{
            System.out.println(String.format("%d / %d = %d", num1, num2, num1/num2));
            System.out.println(num1 + " % " + num2 + " = " + num1%num2);
        }
    }
}