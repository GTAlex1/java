package metodos.Ejercicio1;

public class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(Punto otro) {
        this.x = otro.x;
        this.y = otro.y;
    }

    public void mostrar(String nombre) {
        System.out.println(nombre + " = (" + x + ", " + y + ")");
    }

    public double distanciaOrigen() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distancia(Punto otro) {
        double dx = otro.x - this.x;
        double dy = otro.y - this.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        
    }

    public boolean esIgual(Punto otro) {
        return this.x == otro.x && this.y == otro.y;
    }
}
