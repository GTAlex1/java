
package ejBucles.ej6;

import java.util.Arrays;

public class TestEj6 {
    public static void main(String[] args) {
        Ej6 ej = new Ej6();

        double[][] entradas = {
            {8, 3, 10, 7}, {5}, {-8, -3, -12},
            {0, 0, 0}, {2.5, 3.5}
        };

        double[][] esperados = {
            {3, 7}, {5, 5}, {-12, -23.0/3},
            {0, 0}, {2.5, 3}
        };

        for (int i=0; i<entradas.length; i++) {
            double[] resultado = ej.calcularEstadisticas(entradas[i]);
            boolean correcto = Math.abs(resultado[0]-esperados[i][0]) < 1e-9
                && Math.abs(resultado[1]-esperados[i][1]) < 1e-9;

            System.out.println((correcto ? "PASS " : "FAIL ")
                + Arrays.toString(resultado));
        }
    }
}
