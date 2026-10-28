package metodos.Ejercicio1;

public class testLine {
    public static void main(String[] args) {
        Linea l = new Linea(new Punto(1, 1), new Punto(4, 5));
        System.out.println("Longitud: " + l.distancia()); // 5.0

        l.setFin(new Punto(1, 1)); // ahora inicio y fin coinciden
        System.out.println("Longitud: " + l.distancia()); // 0.0
        
        l.setFin(new Punto(1, 6)); // línea vertical de (1,1) a (1,6)
        System.out.println("Longitud: " + l.distancia()); // 5.0
    }
}
