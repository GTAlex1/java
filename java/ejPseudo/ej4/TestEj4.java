
package ejPseudo.ej4;

public class TestEj4 {

    public static void main(String[] args) {
        Ej4 ejercicio = new Ej4();

        // Casos de prueba: {hombres, mujeres}
        int[][] casos = {
                { 12, 8 }, // 60% y 40%
                { 5, 5 }, // 50% y 50%
                { 3, 1 }, // 75% y 25%
                { 1, 3 }, // 25% y 75%
                { 0, 10 }, // 0% y 100%
                { 10, 0 }, // 100% y 0%
                { 0, 0 }, // Grupo vacío
                { 1, 2 }, // Porcentajes decimales
                { 2, 1 }, // Porcentajes decimales
                { 25, 75 } // 25% y 75%
        };

        // Resultados esperados
        double[][] esperados = {
                { 60.0, 40.0 },
                { 50.0, 50.0 },
                { 75.0, 25.0 },
                { 25.0, 75.0 },
                { 0.0, 100.0 },
                { 100.0, 0.0 },
                { 0.0, 0.0 },
                { 100.0 / 3, 200.0 / 3 },
                { 200.0 / 3, 100.0 / 3 },
                { 25.0, 75.0 }
        };

        int correctos = 0;

        for (int i = 0; i < casos.length; i++) {
            double[] resultado = ejercicio.calcularPorcentajes(
                    casos[i][0], casos[i][1]);

            boolean correcto = resultado != null &&
                    resultado.length == 2 &&
                    Math.abs(resultado[0] - esperados[i][0]) < 0.000001 &&
                    Math.abs(resultado[1] - esperados[i][1]) < 0.000001;

            System.out.println(
                    "Prueba " + (i + 1) +
                            " | Hombres: " + casos[i][0] +
                            " | Mujeres: " + casos[i][1] +
                            " | Esperado: " + esperados[i][0] + "%, " + esperados[i][1] + "%" +
                            " | Obtenido: " + resultadoTexto(resultado) +
                            " | " + (correcto ? "OK" : "ERROR"));

            if (correcto) {
                correctos++;
            }
        }

        System.out.println(
                "\nResultado: " + correctos + "/" +
                        casos.length + " pruebas superadas.");
    }

    private static String resultadoTexto(double[] resultado) {
        if (resultado == null) {
            return "null";
        }

        if (resultado.length != 2) {
            return "Array de longitud " + resultado.length;
        }

        return resultado[0] + "%, " + resultado[1] + "%";
    }
}
