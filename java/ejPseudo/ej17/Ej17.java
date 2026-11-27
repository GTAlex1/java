
/*
    Leer una temperatura y escribir qué deporte
    es apropiado para esa temperatura, usando
    los siguientes criterios:

    Natación          > 85
    Tenis             70 < Temp. <= 85
    Golf              32 < Temp. <= 70
    Esquí             10 < Temp. <= 32
    Deportes interior <= 10

    Temperatura expresada en grados Fahrenheit.
*/

package ejPseudo.ej17;

public class Ej17 {

    public String obtenerDeporte(double temperatura) {
        if (temperatura > 85) {
            return "Natación";
        } else if (temperatura > 70 && temperatura <= 85) {
            return "Tenis";
        } else if (temperatura > 32 && temperatura <= 70) {
            return "Golf";
        } else if (temperatura > 10 && temperatura <= 32) {
            return "Esquí";
        } else {
            return "Deportes interior";
        }
    }
}
