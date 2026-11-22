/*
    Objetivo: modifica tu Ej7.java para que:
    - Si minutos < 0, lance una IllegalArgumentException.
    - Si minutos == 0, devuelva 0.10.
    - Si minutos > 0, calcule el precio como antes.
*/

package ejPseudo.ej7;

public class Ej7mod1 {

    public double calcularCoste(int minutos) {
        int coste = 0;

        if (minutos < 0) {
            throw new IllegalArgumentException("La duración no puede ser negativa");
        } else if (minutos > 3) {
            coste = (minutos - 3) * 5;
        }
        coste += 10;

        return coste / 100.0;
    }
}
