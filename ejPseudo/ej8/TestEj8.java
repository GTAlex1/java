
package ejPseudo.ej8;

public class TestEj8 {

    public static void main(String[] args) {

        Ej8 ejercicio = new Ej8();

        int[][] entradas = {
                { 8, 3 },
                { 2, 5 },
                { 4, 4 },
                { -2, -5 },
                { -3, 4 },
                { 0, 0 },
                { 0, 5 },
                { 5, 0 },
                { -5, 0 },
                { 0, -5 },
                { -10, -10 },
                { 100, 99 },
                { 1, 100 },
                { Integer.MAX_VALUE, 0 },
                { Integer.MIN_VALUE, 0 }
        };

        int[] esperados = {
                11, 10, 16, -7, -12,
                0, 0, 5, 0, -5,
                100, 199, 100,
                Integer.MAX_VALUE,
                0
        };

        int superadas = 0;

        for (int i = 0; i < entradas.length; i++) {

            int a = entradas[i][0];
            int b = entradas[i][1];

            int resultado = ejercicio.calcular(a, b);
            boolean correcto = resultado == esperados[i];

            System.out.printf(
                    "Prueba %02d | a=%d | b=%d | Esperado=%d | Obtenido=%d | %s%n",
                    i + 1,
                    a,
                    b,
                    esperados[i],
                    resultado,
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
