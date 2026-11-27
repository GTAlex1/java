
package ejPseudo.ej7;

public class TestEj7mod1 {

    public static void main(String[] args) {

        Ej7mod1 ejercicio = new Ej7mod1();

        int[] minutos = {
                0, 1, 2, 3, 4, 5, 8, 10, 60, 120,
                -1, -2, -3, -4, -100
        };

        double[] esperados = {
                0.10, 0.10, 0.10, 0.10, 0.15,
                0.20, 0.35, 0.45, 2.95, 5.95
        };

        int superadas = 0;

        for (int i = 0; i < minutos.length; i++) {

            boolean correcto = false;

            try {
                double resultado = ejercicio.calcularCoste(minutos[i]);

                if (minutos[i] >= 0) {
                    correcto = Math.abs(
                            resultado - esperados[i]) < 0.000001;
                }

            } catch (IllegalArgumentException e) {
                correcto = minutos[i] < 0;
            }

            System.out.printf(
                    "Prueba %d | Minutos: %d | %s%n",
                    i + 1,
                    minutos[i],
                    correcto ? "OK" : "ERROR");

            if (correcto) {
                superadas++;
            }
        }

        System.out.printf(
                "%nResultado: %d/%d pruebas superadas.%n",
                superadas,
                minutos.length);
    }
}
