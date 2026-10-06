import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args) {
        int number=0;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        System.out.println(Math.abs(number));
    }
}