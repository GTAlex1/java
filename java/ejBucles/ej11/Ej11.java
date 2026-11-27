
/*
    Aceptar números por teclado hasta que se introduzca un 0 y
    visualizar cuántos pares e impares se han introducido en
    la secuencia. Hacerlo con while y con do-while.
*/

package ejBucles.ej11;

public class Ej11 {

    public int[] contarConWhile(int[] numeros) {
        if (numeros.length == 0 || numeros[0] == 0){
            return new int[]{0,0};
        }
        int i=0, par=0, impar=0;
        while (i<numeros.length && numeros[i]!=0) {
            if (numeros[i] % 2 == 0) {par++;} else {impar++;}
            i++;
        }
        return new int[]{par, impar};
    }

    public int[] contarConDoWhile(int[] numeros) {
        int i = 0, par = 0, impar = 0;
        if (numeros.length == 0 || numeros[0] == 0) {
                return new int[] { 0, 0 };
        }
        do {
            if (numeros[i] % 2 == 0) {par++;} else {impar++;}
            i++;
        } while (i < numeros.length && numeros[i] != 0);
        return new int[] { par, impar };

    }
}
