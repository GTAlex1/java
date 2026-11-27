
package ejBucles.ej12;

public class TestEj12 {
    public static void main(String[] args) {
        Ej12 ej = new Ej12();

        int[] entradas = {0, 1, 2, 3, 5, 10, 15, 20};
        long[] esperados = {1, 1, 2, 6, 120, 3628800, 1307674368000L, 2432902008176640000L};

        for (int i = 0; i < entradas.length; i++) {
            long resultado = ej.calcularFactorial(entradas[i]);

            System.out.println(
                "Prueba " + (i + 1) + ": "
                + (resultado == esperados[i] ? "PASS" : "FAIL")
                + " | Resultado: " + resultado
            );
        }
    }
}
