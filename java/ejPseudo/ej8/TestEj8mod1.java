
package ejPseudo.ej8;

public class TestEj8mod1 {

    public static void main(String[] args) {

        Ej8mod1 ejercicio = new Ej8mod1();

        int[][] entradas = {
                { 8, 3 },
                { 2, 5 },
                { 4, 4 },
                { -2, -5 },
                { -3, 4 },
                { 0, 0 },
                { 5, 0 },
                { 0, -5 },
                { -10, -10 },
                { 100, 99 },
                { 1, 100 },
                { Integer.MAX_VALUE, 0 },
                { Integer.MIN_VALUE, 0 },
                { Integer.MAX_VALUE, 1 },
                { Integer.MIN_VALUE, 2 },
                { 50000, 50000 }
        };

        long[] esperados = {
                11, 10, 16, -7, -12,
                0, 5, -5, 100, 199,
                100, Integer.MAX_VALUE, 0,
                2147483648L,
                -4294967296L,
                2500000000L
        };

        int superadas = 0;

        for (int i = 0; i < entradas.length; i++) {

            int a = entradas[i][0];
            int b = entradas[i][1];

            boolean debeLanzarExcepcion = esperados[i] > Integer.MAX_VALUE ||
                    esperados[i] < Integer.MIN_VALUE;

            boolean correcto = false;

            try {
                int resultado = ejercicio.calcular(a, b);

                if (!debeLanzarExcepcion) {
                    correcto = resultado == esperados[i];
                }

            } catch (ArithmeticException e) {
                correcto = debeLanzarExcepcion;
            }

            System.out.printf(
                    "Prueba %02d | a=%d | b=%d | %s%n",
                    i + 1,
                    a,
                    b,
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
