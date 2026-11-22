
package ejPseudo.ej15;

public class TestEj15 {

    public static void main(String[] args) {
        Ej15 ejercicio = new Ej15();

        int[] camisas = {
                1, 2, 3, 5, 10, 1, 2, 3,
                0, -1, 2, 3
        };

        double[] precios = {
                20, 20, 20, 15, 10, 0, 12.5, 12.5,
                20, 20, -5, -5
        };

        double[] esperados = {
                18, 36, 48, 60, 80, 0, 22.5, 30
        };

        int superadas = 0;

        for (int i = 0; i < camisas.length; i++) {
            boolean esperaError = i >= esperados.length;
            boolean correcto = false;

            try {
                double resultado = ejercicio.calcularTotal(
                        camisas[i], precios[i]);

                if (!esperaError) {
                    correcto = Math.abs(
                            resultado - esperados[i]) < 1e-9;
                }

            } catch (IllegalArgumentException e) {
                correcto = esperaError;
            }

            System.out.printf(
                    "Prueba %02d | %s%n",
                    i + 1,
                    correcto ? "OK" : "ERROR");

            if (correcto) {
                superadas++;
            }
        }

        System.out.printf(
                "%nResultado: %d/%d pruebas superadas.%n",
                superadas,
                camisas.length);
    }
}
