
package ejPseudo.ej9;

public class TestEj9 {

    public static void main(String[] args) {

        Ej9 ejercicio = new Ej9();

        double[][] entradas = {
                { 1, -3, 2 },
                { 1, -2, 1 },
                { 1, 0, -4 },
                { 1, 0, 1 },
                { 0, 2, 4 },
                { 1, 5, 6 },
                { 2, -7, 3 },
                { -1, 3, -2 },
                { 1, 2, 5 },
                { 1, 0, 0 },
                { 2, 0, -8 },
                { 1, 1, -6 },
                { 3, -6, 3 },
                { 0, 0, 0 },
                { 1, -4, 0 },
                { 1, 0, -2 }
        };

        double[][] esperados = {
                { 2, 1 },
                { 1, 1 },
                { 2, -2 },
                null,
                null,
                { -2, -3 },
                { 3, 0.5 },
                { 1, 2 },
                null,
                { 0, 0 },
                { 2, -2 },
                { 2, -3 },
                { 1, 1 },
                null,
                { 4, 0 },
                { Math.sqrt(2), -Math.sqrt(2) }
        };

        String[] errores = {
                null, null, null,
                "Discriminante negativo",
                "No se puede dividir entre 0",
                null, null, null,
                "Discriminante negativo",
                null, null, null, null,
                "No se puede dividir entre 0",
                null, null
        };

        int superadas = 0;
        double tolerancia = 0.000000001;

        for (int i = 0; i < entradas.length; i++) {

            double a = entradas[i][0];
            double b = entradas[i][1];
            double c = entradas[i][2];

            boolean correcto = false;

            try {
                double[] resultado = ejercicio.resolver(a, b, c);

                if (esperados[i] != null &&
                        resultado != null &&
                        resultado.length == 2) {

                    correcto = Math.abs(resultado[0] - esperados[i][0]) < tolerancia &&
                            Math.abs(resultado[1] - esperados[i][1]) < tolerancia;
                }

            } catch (ArithmeticException e) {
                correcto = errores[i] != null &&
                        errores[i].equals(e.getMessage());
            }

            System.out.printf(
                    "Prueba %02d | a=%s b=%s c=%s | %s%n",
                    i + 1,
                    a, b, c,
                    correcto ? "OK" : "ERROR");

            if (correcto) {
                superadas++;
            }
        }

        System.out.printf(
                "%nResultado: %d/%d pruebas superadas.%n",
                superadas,
                entradas.length);
    }
}
