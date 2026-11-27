
package ejPseudo.ej13;

public class TestEj13 {

    public static void main(String[] args) {
        Ej13 ejercicio = new Ej13();

        double[][] casos = {
                { 10, 5 },
                { 3, 4 },
                { 2.5, 4 },
                { 1, 1 },
                { 0.1, 0.2 },
                { 100, 200 },
                { 0, 5 },
                { 5, 0 },
                { -3, 4 },
                { 5, -2 },
                { -3, -4 },
                { 0, 0 }
        };

        double[] esperados = {
                25, 6, 5, 0.5, 0.01, 10000
        };

        int superadas = 0;

        for (int i = 0; i < casos.length; i++) {
            boolean esperaError = i >= esperados.length;
            boolean correcto = false;

            try {
                double resultado = ejercicio.calcularArea(
                        casos[i][0], casos[i][1]);

                if (!esperaError) {
                    correcto = Math.abs(
                            resultado - esperados[i]) < 1e-9;
                }

            } catch (IllegalArgumentException e) {
                correcto = esperaError;
            }

            System.out.printf(
                    "Prueba %02d: %s%n",
                    i + 1,
                    correcto ? "OK" : "ERROR");

            if (correcto) {
                superadas++;
            }
        }

        System.out.printf(
                "%nResultado: %d/%d pruebas superadas.%n",
                superadas,
                casos.length);
    }
}
