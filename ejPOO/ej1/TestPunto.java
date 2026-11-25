package ejPOO.ej1;

import java.util.Arrays;

public class TestPunto {

    private static int correctos = 0, total = 0;

    private static void comprobar(String prueba, Object obtenido, Object esperado) {
        total++;

        boolean ok = esperado.equals(obtenido);

        if (ok)
            correctos++;

        System.out.println("Prueba " + total + ": "
                + (ok ? "OK" : "ERROR")
                + " | " + prueba
                + " | Obtenido: " + obtenido
                + " | Esperado: " + esperado);
    }

    public static void main(String[] args) {

        Punto a = new Punto(3, 4);
        Punto b = new Punto(6, 4);
        Punto c = new Punto(a);
        Punto d = new Punto();

        // Constructores
        comprobar("Constructor vacío", d.toString(), "(0.0,0.0)");
        comprobar("Constructor coordenadas", a.toString(), "(3.0,4.0)");
        comprobar("Constructor copia", c.toString(), "(3.0,4.0)");

        // Getters
        comprobar("getX", a.getX(), 3.0);
        comprobar("getY", a.getY(), 4.0);
        comprobar("getPunto", Arrays.toString(a.getPunto()), "[3.0, 4.0]");

        // Visualización
        comprobar("visualizarPunto", a.visualizarPunto("A"), "A : (3.0,4.0)");

        // Distancias
        comprobar("Distancia A-B", a.distanciaPunto(b), 3.0);
        comprobar("Distancia B-A", b.distanciaPunto(a), 3.0);
        comprobar("Distancia al origen", a.distanciaOrigen(), 5.0);
        comprobar("Distancia mismo punto", a.distanciaPunto(a), 0.0);
        comprobar("Distancia desde origen", d.distanciaOrigen(), 0.0);
        comprobar("Coordenadas negativas", new Punto(-3, -4).distanciaOrigen(), 5.0);

        // Comparaciones
        comprobar("Puntos iguales", a.comparacionPuntos(c), true);
        comprobar("Puntos diferentes", a.comparacionPuntos(b), false);
        comprobar("Coordenadas invertidas", a.comparacionPuntos(new Punto(4, 3)), false);
        comprobar("Comparación con origen", a.comparacionPuntos(d), false);

        // Setters
        d.setX(8);
        comprobar("setX", d.toString(), "(8.0,0.0)");

        d.setY(9);
        comprobar("setY", d.toString(), "(8.0,9.0)");

        d.setPunto(-2, -5);
        comprobar("setPunto", d.toString(), "(-2.0,-5.0)");

        // Independencia del constructor copia
        c.setX(100);
        comprobar("Copia independiente", a.getX(), 3.0);

        // Encapsulación del array
        double[] coordenadas = a.getPunto();
        coordenadas[0] = 999;
        comprobar("Encapsulación", a.getX(), 3.0);

        System.out.println("\n" + correctos + "/" + total + " correctos");
    }
}
