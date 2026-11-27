
/*
    6. En un hospital existen tres áreas: Ginecología,
    Pediatría y Traumatología. El presupuesto anual del
    hospital se reparte conforme a la siguiente tabla:

    Ginecología: 40%
    Traumatología: 30%
    Pediatría: 30%

    Visualizar la cantidad de dinero que recibirá cada
    área, para el presupuesto que se introduzca por teclado.
*/

package ejPseudo.ej6;

public class Ej6 {

    public double[] calcularPresupuestos(double presupuesto) {
        // 1. Calcula el dinero destinado a Ginecología.
        double pGinecologia = presupuesto * 0.40;
        // 2. Calcula el dinero destinado a Traumatología.
        double pTraumatologia = presupuesto * 0.30;
        // 3. Calcula el dinero destinado a Pediatría.
        double pPediatria = presupuesto * 0.30;
        // 4. Devuelve las tres cantidades en un array.

        return new double[] { pGinecologia, pTraumatologia, pPediatria };
    }
}
