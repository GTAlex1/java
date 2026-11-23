
package ejBucles.ej3;

import java.util.Arrays;

public class TestEj3 {
    public static void main(String[] args) {
        Ej3 ej = new Ej3();

        int[][] entradas = {{3,12}, {2,8}, {7,7}, {8,8}, {10,15}};
        int[][] esperados = {{3,5,7,9,11}, {3,5,7}, {7}, {}, {11,13,15}};

        for (int i = 0; i < entradas.length; i++) {
            int[] resultado = ej.obtenerImpares(entradas[i][0], entradas[i][1]);
            System.out.println((Arrays.equals(resultado, esperados[i]) ? "PASS" : "FAIL")
                + " " + Arrays.toString(resultado));
        }
    }
}
