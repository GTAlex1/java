
/*
    Consigue que tu programa calcule exactamente los mismos precios, pero utilizando únicamente operaciones con números enteros.
    No puedes utilizar Math.ceil(), Math.round() ni Math.floor().
    Pista: investiga qué ocurre con la división entera cuando sumas 59 al numerador antes de dividir entre 60.
*/

package ejPseudo.ej7;

public class Ej7mod3 {

    public double calcularCoste(int segundos) {
        int coste = 0;

        if (segundos < 0) {
            throw new IllegalArgumentException("La duración no puede ser negativa");
        } else if (segundos > 180) {
            coste = ((segundos + 59) / 60 - 3) * 5;
        }
        coste += 10;

        return coste / 100.0;
    }
}
