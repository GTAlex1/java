
package ejPseudo.ej2;

public class TestEj2 {
    public static void main(String[] args) {

        Ej2 ejercicio = new Ej2();

        int[] edades = { 0, 1, 10, 18, 20, 35, 60, 100, 219, 220 };

        double[] esperados = {
                22.0, 21.9, 21.0, 20.2, 20.0,
                18.5, 16.0, 12.0, 0.1, 0.0
        };

        int correctos = 0;

        for (int i = 0; i < edades.length; i++) {

            double obtenido = ejercicio.calcularPulsaciones(edades[i]);

            boolean correcto = Math.abs(obtenido - esperados[i]) < 0.000001;

            System.out.println(
                    "Edad: " + edades[i] +
                            " | Esperado: " + esperados[i] +
                            " | Obtenido: " + obtenido +
                            " | " + (correcto ? "OK" : "ERROR"));

            if (correcto) {
                correctos++;
            }
        }

        System.out.println("\nResultado: " + correctos +
                "/" + edades.length + " pruebas superadas.");
    }
}
