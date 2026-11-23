
package ejBucles.ej7;

import java.util.Arrays;

public class TestEj7 {
    public static void main(String[] args) {
        Ej7 ej = new Ej7();

        int[][] entradas = {
                { 5, 25, 10 }, {}, { 0 }, { 24, 1 }, { 30, 2 }, new int[25]
        };
        int[][] esperados = {
                { 15, 325 }, {}, { 0 }, { 300, 1 }, { 465 }, new int[20]
        };

        for (int i = 0; i < entradas.length; i++) {
            int[] resultado = ej.calcularSumatorios(entradas[i]);
            System.out.println((Arrays.equals(resultado, esperados[i]) ? "PASS" : "FAIL")
                    + " " + Arrays.toString(resultado));
        }
    }
}
