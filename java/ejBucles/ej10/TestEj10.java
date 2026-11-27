
package ejBucles.ej10;

public class TestEj10 {
    public static void main(String[] args) {
        Ej10 ej = new Ej10();

        double[][] entradas = {
                { 50, 60, 100, 30 },
                { 40, 60, 50 },
                { 100, 100, 20 },
                { 201, 50 },
                {},
                { 80.5, 70.5, 50 }
        };

        double[] esperados = { 210, 150, 220, 201, 0, 201 };

        for (int i = 0; i < entradas.length; i++) {
            double resultado = ej.sumarPesos(entradas[i]);

            System.out.println(
                    "Prueba " + (i + 1) + ": " +
                            (Math.abs(resultado - esperados[i]) < 0.000001 ? "PASS" : "FAIL")
                            + " | Resultado: " + resultado);
        }
    }
}
