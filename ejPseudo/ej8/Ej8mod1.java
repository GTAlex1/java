
/*
    Pedir la introducción de dos números enteros, a y b.
    Si a es mayor que b visualizar la suma y en caso
    contrario, visualizar el producto.
*/

package ejPseudo.ej8;

public class Ej8mod1 {

    public int calcular(int a, int b) {

        return a > b ? Math.addExact(a, b) : Math.multiplyExact(a, b);
    }
}
