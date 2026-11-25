/*
    Implementa la clase Línea con puntos de inicio y final de la recta.

    a. Constructor que inicialice los dos puntos.
    b. Mostrar los dos puntos.
    c. Métodos get’s y set’s.
    d. Método que devuelve la longitud de la recta.
*/

package ejPOO.ej2;

import ejPOO.ej1.Punto;

public class Linea {
    private Punto str, end;

    // #region Constructor
    public Linea(Punto x, Punto y){
        this.setLinea(x, y);
    }
    // #endregion

    // #region Mostrar

    public String mostrarPuntos() {
        return str.visualizarPunto("p1") + " : " + end.visualizarPunto("p2");
    }
    // #endregion

    // #region Get's y set's
    public Punto[] getLinea() {
        return new Punto[] { this.getStr(), this.getEnd()};
    }

    public Punto getStr() {
        return new Punto(this.str);
    }

    public Punto getEnd() {
        return new Punto(this.end);
    }

    public void setLinea(Punto str, Punto end) {
        this.str = new Punto(str);
        this.end = new Punto(end);
    }

    public void setStr(Punto str) {
        this.str = new Punto(str);
    }

    public void setEnd(Punto end) {
        this.end = new Punto(end);
    }
    // #endregion

    //#region Longitud recta
    public double longitudRecta(){
        return this.str.distanciaPunto(this.end);
    }
     //#endregion
}
