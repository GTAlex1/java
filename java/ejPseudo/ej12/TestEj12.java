
package ejPseudo.ej12;

public class TestEj12 {

    public static void main(String[] args) {

        Ej12 ejercicio = new Ej12();

        int[][] entradas = {
                { 10, 0, 11, 30 },
                { 8, 15, 9, 0 },
                { 12, 30, 12, 45 },
                { 14, 0, 14, 0 },
                { 0, 0, 23, 59 },
                { 23, 58, 23, 59 },
                { 10, 59, 11, 0 },
                { 12, 0, 11, 59 },
                { 23, 0, 0, 0 },
                { 25, 0, 12, 0 },
                { -1, 0, 12, 0 },
                { 10, 60, 12, 0 },
                { 10, -1, 12, 0 },
                { 10, 0, 24, 0 },
                { 10, 0, 12, 60 },
                { 10, 0, 12, -1 }
        };

        int[] esperados = {
                90, 45, 15, 0, 1439, 1, 1,
                0, 0, 0, 0, 0, 0, 0, 0, 0
        };

        String[] errores = {
                null, null, null, null, null, null, null,
                "La hora de inicio es mayor a la hora de fin.",
                "La hora de inicio es mayor a la hora de fin.",
                "Hora inválida.",
                "Hora inválida.",
                "Hora inválida.",
                "Hora inválida.",
                "Hora inválida.",
                "Hora inválida.",
                "Hora inválida."
        };

        int superadas = 0;

        for (int i = 0; i < entradas.length; i++) {

            boolean correcto = false;

            try {
                int resultado = ejercicio.calcularMinutos(
                        entradas[i][0],
                        entradas[i][1],
                        entradas[i][2],
                        entradas[i][3]);

                correcto = errores[i] == null &&
                        resultado == esperados[i];

            } catch (IllegalArgumentException e) {
                correcto = errores[i] != null &&
                        errores[i].equals(e.getMessage());
            }

            System.out.printf(
                    "Prueba %02d | %02d:%02d - %02d:%02d | %s%n",
                    i + 1,
                    entradas[i][0],
                    entradas[i][1],
                    entradas[i][2],
                    entradas[i][3],
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
