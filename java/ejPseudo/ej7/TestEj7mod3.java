
package ejPseudo.ej7;

public class TestEj7mod3 {

    public static void main(String[] args) {

        Ej7mod3 ejercicio = new Ej7mod3();

        int[] segundos = {
                0, 1, 59, 60, 119, 120,
                179, 180, 181, 210, 239, 240,
                241, 300, 600, 3600,
                -1, -60, -181,
                Integer.MAX_VALUE
        };

        double[] esperados = {
                0.10, 0.10, 0.10, 0.10,
                0.10, 0.10, 0.10, 0.10,
                0.15, 0.15, 0.15, 0.15,
                0.20, 0.20, 0.45, 2.95,
                0, 0, 0,
                1789569.05
        };

        int superadas = 0;

        for (int i = 0; i < segundos.length; i++) {

            boolean correcto = false;

            try {
                double resultado = ejercicio.calcularCoste(segundos[i]);

                if (segundos[i] >= 0) {
                    correcto = Math.abs(
                            resultado - esperados[i]) < 0.000001;
                }

            } catch (IllegalArgumentException e) {
                correcto = segundos[i] < 0;
            }

            System.out.printf(
                    "Prueba %02d | %12d segundos | %s%n",
                    i + 1,
                    segundos[i],
                    correcto ? "OK" : "ERROR");

            if (correcto) {
                superadas++;
            }
        }

        System.out.printf(
                "%nResultado: %d/%d pruebas superadas.%n",
                superadas,
                segundos.length);
    }
}
