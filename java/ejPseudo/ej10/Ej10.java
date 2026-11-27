
/*
    Programa que permita ingresar un número de 1 a 7
    y visualice el correspondiente día de la semana
    (1 -> Lunes, 2 -> Martes, etc).

    Si el número introducido no está comprendido
    entre 1 y 7 visualizar:
    "Error: valor fuera de rango".
*/

package ejPseudo.ej10;

public class Ej10 {

    public String obtenerDia(int numero) {

        switch (numero) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Error: valor fuera de rango";
        }

    }
}
