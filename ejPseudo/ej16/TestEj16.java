
package ejPseudo.ej16;

public class TestEj16 {

    public static void main(String[] args) {
        Ej16 ejercicio = new Ej16();

        String[][] respuestas = {
                { "Si", "No", "No" },
                { "SI", "NO", "NO" },
                { "si", "no", "no" },
                { "sI", "nO", "No" },
                { "No", "No", "No" },
                { "Si", "Si", "No" },
                { "Si", "No", "Si" },
                { "", "No", "No" },
                { "Si", "", "No" },
                { "Si", "No", "" },
                { "Hola", "No", "No" },
                { "Si", "No", "Hola" }
        };

        int superadas = 0;

        for (int i = 0; i < respuestas.length; i++) {
            String esperado = i < 4
                    ? "Ha respondido correctamente a todas las respuestas"
                    : "Respuesta incorrecta";

            String resultado = ejercicio.jugar(
                    respuestas[i][0],
                    respuestas[i][1],
                    respuestas[i][2]);

            boolean correcto = resultado.equals(esperado);

            System.out.printf(
                    "Prueba %02d: %s%n",
                    i + 1,
                    correcto ? "OK" : "ERROR");

            if (correcto)
                superadas++;
        }

        System.out.printf(
                "%nResultado: %d/%d pruebas superadas.%n",
                superadas,
                respuestas.length);
    }
}
