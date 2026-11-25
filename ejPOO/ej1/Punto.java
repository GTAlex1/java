/*
    Crear una clase llamada Punto que tenga dos atributos de tipo
    real x e y para representar las coordenadas cartesianas del
    punto. Además implemente métodos que permitan:

    a. Constructores vacio, copia y con dos coordenadas.
    b. Visualizar las coordenadas del punto.
    c. Devolver la distancia que existe desde ese punto a otro
       punto que es pasado como parámetro.
    d. Devolver la distancia que existe del origen de coordenadas
       al punto.
    e. Indicar si un punto es igual a otro o no (dos puntos son
       iguales cuando sus coordenadas son las mismas).
*/

package ejPOO.ej1;

public class Punto {
    // Tengo que hacer contructores vacíos, copia y de coordenadas, eso significa overloading
    private double x, y;

    //#region Constructores
    public Punto() {
        this(0, 0);
    }

    public Punto(Punto otro) {
        this(otro.x, otro.y);
    }

    public Punto(double x, double y) {
        this.setPunto(x, y);
    }
    //#endregion
    // Ahora voy a hacer los setters y los getters, tengo entendido que son una buena práctica
    //#region Getters y Setters
    public void setPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.setPunto(x, this.y);
    }

    public void setY(double y) {
        this.setPunto(this.x, y);
    }

    public double[] getPunto() {
        return new double[] { this.x, this.y };
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    // #endregion
    // Ahora lo visualizo, arreglo el toString y creo el visualizarPunto
    //#region Visualizar
    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

    public String visualizarPunto(String nombre){
        return nombre + " : "+ this.toString();

    }
    //#endregion
    //Apartados c y d, distancia entre puntos y al punto de origen
    //#region Distancias
    public double distanciaPunto(Punto otro){
        return Math.sqrt(Math.pow(otro.x - this.x, 2)+Math.pow(otro.y - this.y, 2));
    }

    public double distanciaOrigen(){
        return this.distanciaPunto(new Punto());
    }
    //#endregion
    //Apartado e, ¿son iguales?
    //#region Comparación puntos
        public boolean comparacionPuntos(Punto punto){
            return this.x == punto.x && this.y == punto.y;
        }
    //#endregion
}
