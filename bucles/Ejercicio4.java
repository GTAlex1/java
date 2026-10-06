package bucles;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String [] args) {
        int N1=0, N2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        N1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        N2 = sc.nextInt();
        sc.close();

        for (int i=N1+1; i<N2; i++) {
            System.out.print(i + ", ");
        }
    }
}
