package ejBucles.ej14;

import java.util.Arrays;

public class TestEj14 {
    public static void main(String[] args) {
        Ej14 ej = new Ej14();

        int[][] entradas = {
                { 3, 12 },
                { 5, 12 },
                { 6, 12 },
                { 4, 7 },
                { 1, 20 },
                { 0, 12 },
                { 3, 1 },
                { 10, 36 }
        };

        int[][] esperados = {
                { 1, 2, 3 },
                { 1, 2, 3, 4, 6 },
                { 1, 2, 3, 4, 6, 12 },
                { 1, 7 },
                { 1 },
                {},
                { 1 },
                { 1, 2, 3, 4, 6, 9, 12, 18, 36 }
        };

        int correctos = 0;

        for (int i = 0; i < entradas.length; i++) {
            int[] resultado = ej.obtenerDivisores(
                    entradas[i][0], entradas[i][1]);

            boolean ok = Arrays.equals(resultado, esperados[i]);

            if (ok)
                correctos++;

            System.out.println("Prueba " + (i + 1) + ": "
                    + (ok ? "OK" : "ERROR")
                    + " | Obtenido: " + Arrays.toString(resultado)
                    + " | Esperado: " + Arrays.toString(esperados[i]));
        }

        System.out.println("\n" + correctos + "/"
                + entradas.length + " correctos");
    }
}
