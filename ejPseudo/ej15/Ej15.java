
/*
    Algoritmo que calcule el total a pagar por la
    compra de camisas. Si se compran tres camisas
    o más se aplica un descuento del 20% sobre el
    total de la compra y si son menos de tres
    camisas un descuento del 10%
    (Se introduce por teclado el número de camisas
    y el precio –valen todas igual-)
*/

package ejPseudo.ej15;

public class Ej15 {

    public double calcularTotal(int camisas, double precio) {

        // 2. Calcula el importe sin descuento. ¿? creo que no se hizo jeje

        if (camisas >= 3 && precio >= 0) {
            return (camisas*precio)*0.8; // 3. Aplica el descuento correspondiente. // 4. Devuelve el total a pagar.
        } else if (camisas > 0 && precio >= 0) { // 1. Valida que el número de camisas sea positivo y el precio no sea negativo.
            return (camisas*precio) * 0.9; // 3. Aplica el descuento correspondiente. // 4. Devuelve el total a pagar.
        } else {
            throw new IllegalArgumentException("El número de camisas debe ser positivo y el del precio no puede ser negativo");
        }
    }
}
