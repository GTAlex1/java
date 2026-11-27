package ejBucles.ej8;

import java.util.Arrays;

public class Ej8 {

    public int[] calcularSumatorios(int[] numeros) {
        int[] resultados = new int[Math.min(20, numeros.length)];
        int acumulador;
        int validos = 0;

        for (int i = 0; i < numeros.length && validos < 20; i++) {
            if (numeros[i] < 5 || numeros[i] > 100) {
                continue;
            }

            acumulador = 0;
            for (int j = 0; j <= numeros[i]; j++) {
                acumulador += j;
            }

            resultados[validos] = acumulador;
            validos++;

            if (acumulador > 300) {
                return Arrays.copyOf(resultados, validos);
            }
        }
        return Arrays.copyOf(resultados, validos);
    }
}
