
/*
    Programa que realice la suma de los
    10 primeros números enteros.
*/

package ejBucles.ej2;

public class Ej2 {

    public int sumarPrimerosDiez() {
        int contador=0;
        for (int i=1; i<=10; i++){
            contador += i; // Utiliza un bucle para sumar los números del 1 al 10.
        }
        return contador; // Devuelve el resultado.
    }
}
