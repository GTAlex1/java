
/*
    Tu misión es conseguir que Ej7mod4.java supere las 20 pruebas, incluida la última.

    Condiciones:
    - Mantener la división entera.
    - No utilizar Math.ceil(), Math.floor() ni Math.round().
    - Conservar la excepción para duraciones negativas.
    - Evitar desbordamientos tanto en el cálculo de segundos como en el coste.
*/

package ejPseudo.ej7;

public class Ej7mod4 {

    public double calcularCoste(int segundos) {
        long coste = 0;

        if (segundos < 0) {
            throw new IllegalArgumentException("La duración no puede ser negativa");
        } else if (segundos > 180) {
            coste = ((segundos + 59L) / 60 - 3) * 5;
        }
        coste += 10;

        return coste / 100.0;
    }
}
