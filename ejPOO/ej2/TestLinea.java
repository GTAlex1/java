package ejPOO.ej2;

import ejPOO.ej1.Punto;

public class TestLinea {

    private static int correctos = 0, total = 0;

    public static void main(String[] args) {

        Punto p1 = new Punto(1, 1);
        Punto p2 = new Punto(5, 4);

        Linea linea = new Linea(p1, p2);

        // Constructor y getters
        comprobar("Punto inicial", linea.getStr().toString(), "(1.0,1.0)");
        comprobar("Punto final", linea.getEnd().toString(), "(5.0,4.0)");

        // Visualización
        comprobar("Mostrar puntos", linea.mostrarPuntos(),
                "p1 : (1.0,1.0) : p2 : (5.0,4.0)");

        // Longitud
        comprobar("Longitud inicial", linea.longitudRecta(), 5.0);

        // Encapsulación del constructor
        p1.setX(999);
        p2.setY(999);

        comprobar("Independencia inicial", linea.getStr().getX(), 1.0);
        comprobar("Independencia final", linea.getEnd().getY(), 4.0);

        // Encapsulación de los getters
        linea.getStr().setX(999);
        linea.getEnd().setY(999);

        comprobar("Protección getStr", linea.getStr().getX(), 1.0);
        comprobar("Protección getEnd", linea.getEnd().getY(), 4.0);

        // Encapsulación del array
        Punto[] puntos = linea.getLinea();

        puntos[0].setX(999);
        puntos[1].setY(999);

        comprobar("Protección array inicial", linea.getStr().getX(), 1.0);
        comprobar("Protección array final", linea.getEnd().getY(), 4.0);

        // Setters individuales
        linea.setStr(new Punto(0, 0));
        linea.setEnd(new Punto(3, 4));

        comprobar("setStr", linea.getStr().toString(), "(0.0,0.0)");
        comprobar("setEnd", linea.getEnd().toString(), "(3.0,4.0)");
        comprobar("Nueva longitud", linea.longitudRecta(), 5.0);

        // Setter completo
        linea.setLinea(new Punto(0, 0), new Punto(6, 8));

        comprobar("setLinea", linea.longitudRecta(), 10.0);

        // Casos límite
        linea.setLinea(new Punto(2, 2), new Punto(2, 2));

        comprobar("Puntos iguales", linea.longitudRecta(), 0.0);

        linea.setLinea(new Punto(-3, -4), new Punto(0, 0));

        comprobar("Coordenadas negativas", linea.longitudRecta(), 5.0);

        linea.setLinea(new Punto(0, 0), new Punto(0, 7));

        comprobar("Línea vertical", linea.longitudRecta(), 7.0);

        linea.setLinea(new Punto(0, 0), new Punto(8, 0));

        comprobar("Línea horizontal", linea.longitudRecta(), 8.0);

        System.out.println("\n" + correctos + "/" + total + " correctos");
    }

    private static void comprobar(String prueba, Object obtenido, Object esperado) {
        total++;

        boolean correcto = esperado.equals(obtenido);

        if (correcto) {
            correctos++;
        }

        System.out.println("Prueba " + total + " (" + prueba + "): "
                + (correcto ? "OK" : "ERROR")
                + " | Obtenido: " + obtenido
                + " | Esperado: " + esperado);
    }
}
