
package ejPseudo.ej6;

public class TestEj6 {

    public static void main(String[] args) {
        Ej6 ejercicio = new Ej6();

        // Presupuestos anuales del hospital
        double[] presupuestos = {
                100000.0,
                50000.0,
                200000.0,
                1000.0,
                100.0,
                0.0,
                1.0,
                12345.0,
                250000.50,
                999999.99
        };

        // Resultados esperados:
        // {Ginecología, Traumatología, Pediatría}
        double[][] esperados = {
                { 40000.0, 30000.0, 30000.0 },
                { 20000.0, 15000.0, 15000.0 },
                { 80000.0, 60000.0, 60000.0 },
                { 400.0, 300.0, 300.0 },
                { 40.0, 30.0, 30.0 },
                { 0.0, 0.0, 0.0 },
                { 0.40, 0.30, 0.30 },
                { 4938.0, 3703.5, 3703.5 },
                { 100000.20, 75000.15, 75000.15 },
                { 399999.996, 299999.997, 299999.997 }
        };

        int correctos = 0;

        for (int i = 0; i < presupuestos.length; i++) {
            double[] obtenido = ejercicio.calcularPresupuestos(presupuestos[i]);

            boolean correcto = obtenido != null
                    && obtenido.length == 3;

            if (correcto) {
                for (int j = 0; j < 3; j++) {
                    if (Math.abs(obtenido[j] - esperados[i][j]) >= 0.000001) {
                        correcto = false;
                    }
                }
            }

            System.out.println(
                    "Prueba " + (i + 1) +
                            " | Presupuesto: " + presupuestos[i] +
                            " | " + (correcto ? "OK" : "ERROR"));

            if (obtenido != null && obtenido.length == 3) {
                System.out.println(
                        "  Ginecología: " + obtenido[0] +
                                " | Traumatología: " + obtenido[1] +
                                " | Pediatría: " + obtenido[2]);
            }

            if (correcto) {
                correctos++;
            }
        }

        System.out.println(
                "\nResultado: " + correctos + "/" +
                        presupuestos.length + " pruebas superadas.");
    }
}
