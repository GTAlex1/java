
/*
    Repetir la obtención de impares entre N1 y N2.
    Finalizar cuando ambos sean 0.
*/

package ejBucles.ej5;

public class Ej5 {

    public int[][] obtenerImpares(int[][] parejas) {
        int filas=0;
        for (int a=0; a<parejas.length;a++){
            if (parejas[a][0]==0 && parejas[a][1]==0) {
                break;
            }   
            filas++;
        }
        int[][] impares = new int[filas][];
        for (int i=0; i<filas; i++) {
            int n1 = parejas[i][0];
            int n2 = parejas[i][1];

            if (n2<n1){throw new IllegalArgumentException("N2 no puede ser menor a N1");}
            if(n1%2==0){n1++;}
            impares[i] = new int[(n1 > n2) ? 0 : (n2 - n1) / 2 + 1];

            for (int x=0; n1<=n2; n1+=2){
                impares[i][x]=n1;
                x++;
            }
        }
           
        return impares;
    }
}
