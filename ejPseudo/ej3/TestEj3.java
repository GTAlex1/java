
package ejPseudo.ej3;

public class TestEj3 {

    public static void main(String[] args) {

        Ej3 ejercicio = new Ej3();

        double[][] catetos = {
                { 3, 4 },
                { 4, 3 },
                { 5, 12 },
                { 8, 15 },
                { 1, 1 },
                { 0, 5 },
                { 0, 0 },
                { 1.5, 2 },
                { 6, 8 },
                { 300, 400 }
        };

        double[] esperados = {
                5.0,
                5.0,
                13.0,
                17.0,
                Math.sqrt(2),
                5.0,
                0.0,
                2.5,
                10.0,
                500.0
        };

        int correctos = 0;

        for (int i = 0; i < catetos.length; i++) {

            double obtenido = ejercicio.calcularHipotenusa(
                    catetos[i][0], catetos[i][1]);

            boolean correcto = Math.abs(obtenido - esperados[i]) < 0.000001;

            System.out.println(
                    "Prueba " + (i + 1) +
                            " | Catetos: " + catetos[i][0] + ", " + catetos[i][1] +
                            " | Esperado: " + esperados[i] +
                            " | Obtenido: " + obtenido +
                            " | " + (correcto ? "OK" : "ERROR"));

            if (correcto) {
                correctos++;
            }
        }

        System.out.println("\nResultado: " + correctos +
                "/" + catetos.length + " pruebas superadas.");
    }
}
