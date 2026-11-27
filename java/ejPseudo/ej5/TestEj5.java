
package ejPseudo.ej5;

public class TestEj5 {

    public static void main(String[] args) {
        Ej5 ejercicio = new Ej5();

        // Salarios originales
        double[] salarios = {
                1000.0,
                1500.0,
                2000.0,
                800.0,
                1200.0,
                0.0,
                100.0,
                999.99,
                1234.56,
                1.0
        };

        // Salarios esperados después del aumento del 25%
        double[] esperados = {
                1250.0,
                1875.0,
                2500.0,
                1000.0,
                1500.0,
                0.0,
                125.0,
                1249.9875,
                1543.2,
                1.25
        };

        int correctos = 0;

        for (int i = 0; i < salarios.length; i++) {
            double obtenido = ejercicio.calcularNuevoSalario(salarios[i]);

            boolean correcto = Math.abs(obtenido - esperados[i]) < 0.000001;

            System.out.println(
                    "Prueba " + (i + 1) +
                            " | Salario anterior: " + salarios[i] +
                            " | Esperado: " + esperados[i] +
                            " | Obtenido: " + obtenido +
                            " | " + (correcto ? "OK" : "ERROR"));

            if (correcto) {
                correctos++;
            }
        }

        System.out.println(
                "\nResultado: " + correctos + "/" +
                        salarios.length + " pruebas superadas.");
    }
}
