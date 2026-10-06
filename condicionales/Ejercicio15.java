import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        double shirts, price, value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de camisetas: ");
        shirts = sc.nextInt();
        System.out.println("Dime el precio de las camisetas: ");
        price = sc.nextInt();
        sc.close();

        if (shirts >= 3) {
            value = shirts*price*0.8;
        } else {
            value = shirts * price*0.9;
        }

        System.out.println("Tendrías que pagar en total: " + value);
    }
}