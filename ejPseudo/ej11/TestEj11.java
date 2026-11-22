
package ejPseudo.ej11;

public class TestEj11 {

    public static void main(String[] args) {

        Ej11 ejercicio = new Ej11();

        char[] figuras = {
                'C', 'C', 'C', 'C',
                'R', 'R', 'R', 'R',
                'X', 'c', 'r', ' '
        };

        double[][] datos = {
                { 2, 0 },
                { 1, 0 },
                { 0, 0 },
                { 2.5, 0 },
                { 5, 3 },
                { 4, 2.5 },
                { 0, 8 },
                { 1.5, 2 },
                { 2, 3 },
                { 2, 3 },
                { 2, 3 },
                { 2, 3 }
        };

        double[] esperados = {
                4 * Math.PI,
                Math.PI,
                0,
                6.25 * Math.PI,
                15,
                10,
                0,
                3,
                0, 0, 0, 0
        };

        int superadas = 0;
        double tolerancia = 0.000000001;

        for (int i = 0; i < figuras.length; i++) {

            boolean esperaExcepcion = i >= 8;
            boolean correcto = false;

            try {
                double resultado = ejercicio.calcular(
                        figuras[i],
                        datos[i][0],
                        datos[i][1]);

                if (!esperaExcepcion) {
                    correcto = Math.abs(
                            resultado - esperados[i]) < tolerancia;
                }

            } catch (IllegalArgumentException e) {
                correcto = esperaExcepcion;
            }

            System.out.printf(
                    "Prueba %02d | Figura=%s | %s%n",
                    i + 1,
                    figuras[i],
                    correcto ? "OK" : "ERROR");

            if (correcto) {
                superadas++;
            }
        }

        System.out.printf(
                "%nResultado: %d/%d pruebas superadas.%n",
                superadas,
                figuras.length);
    }
}
