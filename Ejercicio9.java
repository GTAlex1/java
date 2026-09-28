import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        c = sc.nextInt();
        sc.close();

        if (a == 0) {
        System.out.println("Error: División entre 0");
        } else if (Math.pow(b, 2) - 4*a*c < 0) {
            System.out.println("Error: Raíz cuadrada de un número negativo");
        } else {
            double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
            double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
            System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
