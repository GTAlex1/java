
package ejPseudo.ej7;

public class TestEj7 {

    public static void main(String[] args) {

        Ej7 ejercicio = new Ej7();

        int[] minutos = {
                1, 2, 3, 4, 5, 6,
                8, 10, 15, 20, 60, 120
        };

        double[] esperados = {
                0.10, 0.10, 0.10, 0.15, 0.20, 0.25,
                0.35, 0.45, 0.70, 0.95, 2.95, 5.95
        };

        int superadas = 0;

        for (int i = 0; i < minutos.length; i++) {

            double resultado = ejercicio.calcularCoste(minutos[i]);

            boolean correcto = Math.abs(resultado - esperados[i]) < 0.000001;

            System.out.printf(
                    "Prueba %d | %d minutos | Esperado: %.2f € | Obtenido: %.2f € | %s%n",
                    i + 1,
                    minutos[i],
                    esperados[i],
                    resultado,
                    correcto ? "OK" : "ERROR");

            if (correcto) {
                superadas++;
            }
        }

        System.out.println();
        System.out.printf(
                "Resultado: %d/%d pruebas superadas.%n",
                superadas,
                minutos.length);
    }
}
