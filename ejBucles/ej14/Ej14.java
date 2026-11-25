/*
    Generar los N primeros divisores de M.
*/

package ejBucles.ej14;

public class Ej14 {

    public int[] obtenerDivisores(int n, int m) {
        int contador=0;
        for (int i = 1; i <= m && contador < n; i++) {
            if (m % i == 0) {
                contador++;
            }
        }
        int[] divisores = new int[contador];
        for (int i=1 , x=0; i<=m && x<contador ;i++){
            if (m%i==0) {
                divisores[x]=i;
                x++;
            }
        }
        return divisores;
    }
}
