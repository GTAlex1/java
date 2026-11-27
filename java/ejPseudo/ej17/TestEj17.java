
package ejPseudo.ej17;

public class TestEj17 {

    public static void main(String[] args) {
        Ej17 ejercicio = new Ej17();

        double[] temperaturas = {
                100, 85.1, 85, 80, 70.1,
                70, 50, 32.1, 32, 20,
                10.1, 10, 0, -20, -100
        };

        String[] esperados = {
                "Natación", "Natación",
                "Tenis", "Tenis", "Tenis",
                "Golf", "Golf", "Golf",
                "Esquí", "Esquí", "Esquí",
                "Deportes interior", "Deportes interior",
                "Deportes interior", "Deportes interior"
        };

        int superadas = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            String resultado = ejercicio.obtenerDeporte(temperaturas[i]);

            boolean correcto = resultado.equals(esperados[i]);

            System.out.printf(
                    "Prueba %02d | %.1f °F | %s%n",
                    i + 1,
                    temperaturas[i],
                    correcto ? "OK" : "ERROR");

            if (correcto)
                superadas++;
        }

        System.out.printf(
                "%nResultado: %d/%d pruebas superadas.%n",
                superadas,
                temperaturas.length);
    }
}
