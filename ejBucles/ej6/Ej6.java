
/*
    Pedir una serie de valores y calcular
    el mínimo y la media.
    Finalizar cuando el usuario responda N.
*/

package ejBucles.ej6;

import java.util.Arrays;

public class Ej6 {
    public double[] calcularEstadisticas(double[] valores) {
        double[] datos= new double[2];
        datos[0]= valores[0];
        for (int i=1; i<valores.length; i++){
            if (datos[0] > valores[i]){datos[0]=valores[i];}
        }
        datos[1]= Arrays.stream(valores).average().orElse(0.0);
    return datos;
    }
}
