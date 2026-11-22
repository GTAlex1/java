// Calcula la hipotenusa de un triángulo rectángulo conocidas las longitudes de los catetos.

package ejPseudo.ej3;

public class Ej3 {

    public double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

}
