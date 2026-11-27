
package ejBucles.ej11;

import java.util.Arrays;

public class TestEj11 {
    public static void main(String[] args) {
        Ej11 ej = new Ej11();

        int[][] entradas = {
                { 2, 7, 4, 9, 0, 6 },
                { 0, 2, 3 },
                { 2, 4, 6 },
                { 1, 3, 5 },
                {},
                { -2, -3, 0, 8 }
        };

        int[][] esperados = {
                { 2, 2 },
                { 0, 0 },
                { 3, 0 },
                { 0, 3 },
                { 0, 0 },
                { 1, 1 }
        };

        for (int i = 0; i < entradas.length; i++) {
            int[] whileResultado = ej.contarConWhile(entradas[i]);
            int[] doWhileResultado = ej.contarConDoWhile(entradas[i]);

            boolean correcto = Arrays.equals(whileResultado, esperados[i])
                    && Arrays.equals(doWhileResultado, esperados[i]);

            System.out.println(
                    "Prueba " + (i + 1) + ": "
                            + (correcto ? "PASS" : "FAIL")
                            + " | while: " + Arrays.toString(whileResultado)
                            + " | do-while: " + Arrays.toString(doWhileResultado));
        }
    }
}
