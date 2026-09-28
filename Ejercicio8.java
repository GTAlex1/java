import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = sc.nextInt();
        sc.close();

        if (a == b) {
            System.out.println("Ambos números son iguales.");
        } else if (a > b) {
            System.out.println(a+b);
        } else {
            System.out.println(a*b);
        }
    }
}