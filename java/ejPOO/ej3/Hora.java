/*
    Cree una clase llamada Hora para guardar las horas, minutos
    y segundos. Queremos:

    a. Constructores; Uno que inicializará este dato a 0;
       otro lo inicializará a valores fijos (y correctos);
       otro que copia otra hora;
       y por último otro que coja la hora actual del sistema.

    b. Visualizar la hora en formato hh:mm:ss

    c. Implementa un método setHora que permita cambiar la hora.
       Deberá impedir la introducción de datos incorrectos
       (control de errores).

    d. Método que devuelva el tiempo transcurrido en segundos,
       desde la media noche.
*/

package ejPOO.ej3;

import java.time.LocalTime;

import examenFinal.Hora;

public class Hora {
    private int[] hora = new int[3];

    // #region a.Constructores
    public Hora() {
        this(0, 0, 0);
    }

    public Hora(int horas, int minutos, int segundos) {
        this.setHora(horas, minutos, segundos);
    }

    public Hora(Hora otra) {
        this(otra.hora[0], otra.hora[1], otra.hora[2]);
    }

    public Hora(LocalTime horaActual) {
        this(horaActual.getHour(), horaActual.getMinute(), horaActual.getSecond());
    }

    // #endregion

    // #region b.visualizarHora
    @Override
    public String toString() {
        return (this.hora[0] < 10 ? "0" + this.hora[0] : this.hora[0]) + ":" +
               (this.hora[1] < 10 ? "0" + this.hora[1] : this.hora[1]) + ":" +
               (this.hora[2] < 10 ? "0" + this.hora[2] : this.hora[2]);
    }

    public String visualizarHora() {
        return this.toString();
    }
    // #endregion

    // #region c.setHora
    public void setHora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            this.hora[0] = horas;
            this.hora[1] = minutos;
            this.hora[2] = segundos;
        }
    }
    // #endregion

    // #region d.tiempoMedianoche
    public int tiempoMedianoche() {
        return this.hora[0] * 3600 + this.hora[1] * 60 + this.hora[2];
    }
    // #endregion
}
