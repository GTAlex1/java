package metodos.Ejercicio1;

public class testPunto {
    public static void main(String[] args) {
        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto();
        Punto p3 = new Punto(p1);

        p1.mostrar("p1");
        p2.mostrar("p2");
        p3.mostrar("p3");

        System.out.println("Distancia de p1 al origen: " + p1.distanciaOrigen());
        System.out.println("Distancia de p1 a p2: " + p1.distancia(p2));
        System.out.println("Distancia de p1 a p3: " + p1.distancia(p3));

        System.out.println("¿p1 y p3 son iguales? " + p1.esIgual(p3));
        System.out.println("¿p1 y p2 son iguales? " + p1.esIgual(p2));
    }
}   
