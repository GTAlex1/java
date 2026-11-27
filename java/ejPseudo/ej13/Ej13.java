
/*
    Leer base y altura de un triángulo y escribir
    el área siempre que los 2 datos sean positivos.

    Visualizar un mensaje de error si alguno de
    los 2 datos es negativo o 0.
*/

package ejPseudo.ej13;

public class Ej13 {

    public double calcularArea(double base, double altura) {
        if (base > 0 && altura > 0) { // 1. Comprueba que ambos valores sean positivos.
            return (base*altura)/2; // 3. Calcula y devuelve el área.
        } else { // 2. Si alguno no es válido, lanza IllegalArgumentException.
            throw new IllegalArgumentException("Ambos valores deben ser positivos");
        }
    }
}
