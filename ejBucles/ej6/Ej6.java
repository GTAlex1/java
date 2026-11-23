
/*
    Pedir una serie de valores y calcular
    el mínimo y la media.
    Finalizar cuando el usuario responda N.
*/

package ejBucles.ej6;

public class Ej6 {
    public double[] calcularEstadisticas(double[] valores) {
        double[] datos= new double[2];
        for (int i=0; i<valores.length; i++){
            if (datos[0] < valores[1]){datos[0]=valores[1];}
            
        }
    return datos;
    }
}
