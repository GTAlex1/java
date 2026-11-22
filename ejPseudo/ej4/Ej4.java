
/*
    Pedir por teclado el NUMERO de hombres y NUMERO de mujeres que hay
    en un grupo de estudiantes. Visualizar el porcentaje de hombres y mujeres
    del total.
*/

package ejPseudo.ej4;

public class Ej4 {

    public double[] calcularPorcentajes(int hombres, int mujeres) {
        // 1. Calcula el total de estudiantes.
        int total = hombres + mujeres;

        // Validamos antes de dividir para evitar división entre 0
        if (total == 0) {
            return new double[] { 0, 0 };
        }

        // 2. Calcula el porcentaje de hombres.
        double porcentajeHombres = hombres / (double) (total) * 100;
        // 3. Calcula el porcentaje de mujeres.
        double porcentajeMujeres = mujeres / (double) (total) * 100;
        // 4. Devuelve ambos porcentajes en un array.

        return new double[] { porcentajeHombres, porcentajeMujeres };
    }
}
