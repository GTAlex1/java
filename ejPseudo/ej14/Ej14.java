
/*
    Calcular el salario semanal de un trabajador.

    Hasta 40 horas se pagan a 16 euros/hora.
    Las horas que superen las 40 se pagan
    a 20 euros/hora.
*/

package ejPseudo.ej14;

public class Ej14 {

    public double calcularSalario(double horas) {
        if (horas < 0) { // 1. Comprueba que las horas no sean negativas.
            throw new IllegalArgumentException("Las horas no pueden ser negativas");
        } else if (horas > 40) { // 3. Si trabaja más de 40 horas, calcula las primeras 40 horas y añade las horas extraordinarias.
            return 640 + (horas-40)*20;
        } else { // 2. Si trabaja 40 horas o menos, calcula el salario normal.
            return horas*16;
        }
    }
}
