
/*
    Calcular el sumatorio de cada número introducido.
    Finalizar tras 20 números o cuando el último
    sumatorio sea mayor que 300.
*/

package ejBucles.ej7;

import java.util.Arrays;

public class Ej7 {

    public int[] calcularSumatorios(int[] numeros) {
        int[] resultados = new int[numeros.length];
        int acumulador;
        int i;
        for (i=0; i<Math.min(20, numeros.length); i++){
            acumulador=0;
            for (int j = 0; j <= numeros[i]; j++) {
                acumulador += j;
            }
            resultados[i]=acumulador;
            if (acumulador > 300) {
                    return Arrays.copyOf(resultados, i + 1);
                }
        }
        return Arrays.copyOf(resultados, i);
    }
}
