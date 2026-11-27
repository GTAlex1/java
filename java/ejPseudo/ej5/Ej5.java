/*
    Calcular el nuevo salario de un obrero si obtuvo un incremento del 25%
    sobre su salario anterior. (Su salario anterior se introduce por teclado)
*/

package ejPseudo.ej5;

public class Ej5 {

    public double calcularNuevoSalario(double salario) {
        // 1. Calcula el incremento del 25%.
        // 2. Suma el incremento al salario anterior.

        salario *= 1.25;
        // 3. Devuelve el nuevo salario.

        return salario;
    }
}
