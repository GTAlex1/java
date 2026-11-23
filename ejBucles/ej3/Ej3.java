
/*
    Visualizar todos los impares comprendidos
    entre N1 y N2.
*/

package ejBucles.ej3;

public class Ej3 {

    public int[] obtenerImpares(int n1, int n2) {
        if(n1%2==0){n1++;}
        int[] impares = new int[(n2-n1)/2+1];
        for (int i=0; n1<=n2; n1+=2){
            impares[i]=n1;
            i++;
        }
        return impares;
    }
}
