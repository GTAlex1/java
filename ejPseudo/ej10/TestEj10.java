
package ejPseudo.ej10;

public class TestEj10 {

    public static void main(String[] args) {

        Ej10 ejercicio = new Ej10();

        int[] entradas = {
                1, 2, 3, 4, 5, 6, 7,
                0, 8, -1, 100, Integer.MAX_VALUE
        };

        String[] esperados = {
                "Lunes",
                "Martes",
                "Miércoles",
                "Jueves",
                "Viernes",
                "Sábado",
                "Domingo",
                "Error: valor fuera de rango",
                "Error: valor fuera de rango",
                "Error: valor fuera de rango",
                "Error: valor fuera de rango",
                "Error: valor fuera de rango"
        };

        int superadas = 0;

        for (int i = 0; i < entradas.length; i++) {

            String resultado = ejercicio.obtenerDia(entradas[i]);
            boolean correcto = esperados[i].equals(resultado);

            System.out.printf(
                    "Prueba %02d | Entrada: %d | %s%n",
                    i + 1,
                    entradas[i],
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
