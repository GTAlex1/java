// Leer un número y escribir el valor absoluto del mismo.

package ejPseudo;

import java.util.Scanner;

public class Ej1 {
    Scanner sc = new Scanner(System.in);

    public int valorAbsoluto(int Number) {
        int number = 0;
        number = sc.nextInt();
        sc.close();

        return Math.abs(number);
    }
}
