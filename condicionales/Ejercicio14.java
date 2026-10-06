import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int hours, value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las horas trabajadas: ");
        hours = sc.nextInt();
        sc.close();

        if (hours > 40) {
            value = (40*16)+((hours-40)*20);
        } else {
            value = hours*16;
        }

        System.out.println("El valor a pagar es: " + value);
    }
}
