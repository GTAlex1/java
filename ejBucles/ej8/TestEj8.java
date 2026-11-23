
package ejBucles.ej8;

import java.util.Arrays;

public class TestEj8 {
    public static void main(String[] args) {
        Ej8 ej = new Ej8();

        int[][] entradas = {
                { -20, 5, 0, 10, 140, 25, 8 },
                { 5, 10, 15 },
                { 100, 5 },
                { -1, 0, 101 },
                {},
                { 24, 5, 10 },
                { 4, 101, 5, 6 }
        };

        int[][] esperados = {
                { 15, 55, 325 },
                { 15, 55, 120 },
                { 5050 },
                {},
                {},
                { 300, 15, 55 },
                { 15, 21 }
        };

        for (int i = 0; i < entradas.length; i++) {
            int[] resultado = ej.calcularSumatorios(entradas[i]);

            System.out.println(
                    "Prueba " + (i + 1) + ": " +
                            (Arrays.equals(resultado, esperados[i]) ? "PASS" : "FAIL")
                            + " | " + Arrays.toString(resultado));
        }
    }
}
