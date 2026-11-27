
/*
    Una llamada no siempre dura un número exacto de minutos.
    Ahora tu método deberá aceptar una duración expresada en segundos y cobrar cada minuto adicional comenzado.
*/

package ejPseudo.ej7;

public class Ej7mod2 {

    public double calcularCoste(int segundos) {
        double coste = 0;

        if (segundos < 0) {
            throw new IllegalArgumentException("La duración no puede ser negativa");
        } else if (segundos > 180) {
            coste = Math.ceil(segundos / 60.0) * 5;
        }
        coste += 10;

        return coste / 100.0;
    }
}
