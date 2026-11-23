
package ejBucles.ej5;

import java.util.Arrays;

public class TestEj5 {
    public static void main(String[] args) {
        Ej5 ej = new Ej5();
        int superadas = 0;

        int[][][] entradas = {
            {{2,6}, {7,11}, {0,0}, {20,30}},
            {{4,4}, {5,5}, {0,0}},
            {{0,0}},
            {{2,8}},
            {{-4,2}, {0,0}}
        };

        int[][][] esperados = {
            {{3,5}, {7,9,11}},
            {{}, {5}},
            {},
            {{3,5,7}},
            {{-3,-1,1}}
        };

        for (int i=0; i<entradas.length; i++) {
            if (Arrays.deepEquals(ej.obtenerImpares(entradas[i]), esperados[i]))
                superadas++;
        }

        try {
            ej.obtenerImpares(new int[][]{{8,3}, {0,0}});
        } catch (IllegalArgumentException e) {
            superadas++;
        }

        System.out.println("Pruebas superadas: " + superadas + "/6");
    }
}
