
package ejBucles.ej4;

import java.util.Arrays;

public class TestEj4 {
    public static void main(String[] args) {
        Ej4 ej = new Ej4();
        int superadas = 0;

        int[][] entradas = {{3,12}, {2,8}, {7,7}, {8,8}, {10,15}};
        int[][] esperados = {{3,5,7,9,11}, {3,5,7}, {7}, {}, {11,13,15}};

        for (int i = 0; i < entradas.length; i++) {
            if (Arrays.equals(ej.obtenerImpares(entradas[i][0], entradas[i][1]), esperados[i]))
                superadas++;
        }

        try {
            ej.obtenerImpares(10, 3);
        } catch (IllegalArgumentException e) {
            superadas++;
        }

        System.out.println("Pruebas superadas: " + superadas + "/6");
    }
}
