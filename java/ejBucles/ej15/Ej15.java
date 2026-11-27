/*
    Programa nos diga si el número introducido es perfecto.

    Un número es perfecto si es igual a la suma de sus divisores.

    Ejemplos:
    - 6: Sus divisores son 1, 2 y 3.
      Al sumarlos (1 + 2 + 3), el resultado es 6.
    - 28: Sus divisores son 1, 2, 4, 7 y 14.
      Al sumarlos (1 + 2 + 4 + 7 + 14), el resultado es 28.
    - 496 y 8128 son los siguientes en la lista.
*/

package ejBucles.ej15;

public class Ej15 {

    public boolean esPerfecto(int numero) {
        // Tengo un número normal, a este número le tengo que sacar los divisores, y luego puedo sumarlos directamente al contador
        int acumulador = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                acumulador += i;
            }
        }

        return numero > 0 && acumulador == numero;

        /* Quiero dejar constacia de que mi idea inicial era hacer un import del ej14 pero luego me dí cuenta de que tenía que igualmente calcular el tamaño
        del array y me dio mucha pereza*/
    }
}
