
/*
    Aceptar por teclado la duración de una llamada telefónica
    y determinar la cantidad a pagar, teniendo en cuenta:

    - Toda llamada que dure menos de 3 minutos tiene un
      coste total de 10 céntimos.
    - Cada minuto adicional a partir de los 3 primeros
      cuesta 5 céntimos.
*/

package ejPseudo.ej7;

public class Ej7 {

    public double calcularCoste(int minutos) {
        int coste = 0;
        if (minutos > 3) {
            coste = (minutos-3)*5;
        }
        coste +=10;
        
        return coste/100.0;
    }
}
