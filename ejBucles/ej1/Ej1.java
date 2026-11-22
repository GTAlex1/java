
/*
    Programa que visualice los números pares
    menores de 100.
*/

package ejBucles.ej1;

public class Ej1 {

    public int[] obtenerPares() {
        int[] array = new int[49];
        for (int i = 2; i < 100; i++) {
            if (i % 2 == 0) {
                array[(i / 2) - 1] = i;
            }
        }
        return array;
    }
}
