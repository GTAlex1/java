import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        float base=0, altitude=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo: ");
        base = sc.nextFloat();
        System.out.println("Ingrese la altura del triangulo: ");
        altitude = sc.nextFloat();
        sc.close();

        if (base > 0 && altitude > 0) {
            System.out.println("El área del triangulo es: " + (base * altitude / 2));
        } else {
            System.out.println("Alguno de los dos valores son negativos.");
        }
    }
}