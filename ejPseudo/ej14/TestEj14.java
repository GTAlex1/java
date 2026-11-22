
package ejPseudo.ej14;

public class TestEj14 {

    public static void main(String[] args) {
        Ej14 ejercicio = new Ej14();

        double[] horas = {
                0, 1, 10, 39, 40, 41,
                45, 50, 40.5, 37.5, -1, -0.5
        };

        double[] esperados = {
                0, 16, 160, 624, 640, 660,
                740, 840, 650, 600, 0, 0
        };

        int superadas = 0;

        for (int i = 0; i < horas.length; i++) {
            boolean esperaError = horas[i] < 0;
            boolean correcto = false;

            try {
                double resultado = ejercicio.calcularSalario(horas[i]);

                correcto = !esperaError &&
                        Math.abs(resultado - esperados[i]) < 1e-9;

            } catch (IllegalArgumentException e) {
                correcto = esperaError;
            }

            System.out.printf(
                    "Prueba %02d | Horas: %.2f | %s%n",
                    i + 1,
                    horas[i],
                    correcto ? "OK" : "ERROR");

            if (correcto) {
                superadas++;
            }
        }

        System.out.printf(
                "%nResultado: %d/%d pruebas superadas.%n",
                superadas,
                horas.length);
    }
}
