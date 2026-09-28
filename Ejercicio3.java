import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cateto1=0, cateto2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer cateto: ");
        cateto1 = sc.nextInt();
        System.out.println("Ingrese el segundo cateto: ");
        cateto2 = sc.nextInt();
        sc.close();

        System.out.println(Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
    }
}
