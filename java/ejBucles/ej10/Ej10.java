// Programa que pida la introducción de pesos, hasta que la suma supere los 200 Kg.

package ejBucles.ej10;

public class Ej10 {
    public double sumarPesos(double[] pesos) {
        double acumulador=0;
        for (int i=0; i<pesos.length; i++){
            acumulador+=pesos[i];
            if (acumulador>200) {return acumulador;}
        }
        return acumulador;
    }
}
