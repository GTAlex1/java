
/*
    Calcular el factorial del número introducido por teclado.
*/

package ejBucles.ej12;

public class Ej12 {

    public long calcularFactorial(int numero) {
        long resultado=1;
        for (int i=numero; i>1; i--){resultado*= i;}
        return resultado;
    }
}
