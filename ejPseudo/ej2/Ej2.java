/*
    Visualizar el número de pulsaciones que una persona debe tener por cada 10 segundos de ejercicio, si la fórmula es:
    Num.pulsación = (220 – edad) / 10
    (La edad se pide por teclado.)
*/

package ejPseudo.ej2;

public class Ej2 {

    public double calcularPulsaciones(int edad) {
        return (double) ((220 - edad)) / 10;
    }
}
