
/*
    Pedir la introducción de una hora de comienzo
    (hora y minutos por separado) y una hora de fin
    (hora y minutos por separado) y visualiza los
    minutos que separan una hora de otra.

    Visualiza los mensajes de error oportunos
    ante posibles errores.
*/

package ejPseudo.ej12;

public class Ej12 {

    public int calcularMinutos(int horaInicio, int minutoInicio, int horaFin, int minutoFin) {

        // 1. Comprueba que las horas estén entre 0 y 23. // 2. Comprueba que los minutos estén entre 0 y 59.
        if (horaInicio >= 0 && horaInicio <= 23 && horaFin >= 0 && horaFin <= 23 &&
            minutoInicio >= 0 && minutoInicio <= 59 && minutoFin >= 0 && minutoFin <= 59 ) {
                minutoInicio += horaInicio * 60; // 3. Convierte ambas horas a minutos totales.
                minutoFin += horaFin * 60; // 3. Convierte ambas horas a minutos totales.
            } else {
                throw new IllegalArgumentException("Hora inválida.");
            }

            if (minutoFin >= minutoInicio) { // 4. Comprueba que la hora final no sea anterior.
                return minutoFin-minutoInicio; // 5. Devuelve la diferencia en minutos.
            } else {
                throw new IllegalArgumentException("La hora de inicio es mayor a la hora de fin.");
            }
    }
}
