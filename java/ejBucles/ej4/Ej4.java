
/*
    Modificar el programa anterior para obligar a que N2 sea igual o mayor a N1.
*/

package ejBucles.ej4;

public class Ej4 {

    public int[] obtenerImpares(int n1, int n2) {
        if (n2<n1){throw new IllegalArgumentException("N2 no puede ser menor a N1");}
        if(n1%2==0){n1++;}
        int[] impares = new int[(n2-n1)/2+1];
        for (int i=0; n1<=n2; n1+=2){
            impares[i]=n1;
            i++;
        }
        return impares;
    }
}
