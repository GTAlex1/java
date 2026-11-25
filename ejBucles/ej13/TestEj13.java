
package ejBucles.ej13;

public class TestEj13 {
    public static void main(String[] args) {
        Ej13 ej = new Ej13();
        int correctos = 0, total = 10;

        int[][] intentos = {
            {50},
            {20, 30, 50},
            {10, 20, 30, 40, 50},
            {10, 20, 30, 40, 60, 50},
            {10, 20},
            {},
            {60, 50, 40}
        };

        int[] esperados = {1, 3, 5, -1, -1, -1, 2};

        for (int i = 0; i < intentos.length; i++) {
            int resultado = ej.adivinarNumero(50, intentos[i]);
            boolean ok = resultado == esperados[i];
            if (ok) correctos++;

            System.out.println("Prueba " + (i + 1) + ": "
                    + (ok ? "OK" : "ERROR")
                    + " | Obtenido: " + resultado
                    + " | Esperado: " + esperados[i]);
        }

        int[] valores = {30, 70, 50};
        String[] pistas = {"Mayor", "Menor", "Correcto"};

        for (int i = 0; i < valores.length; i++) {
            String resultado = ej.obtenerPista(50, valores[i]);
            boolean ok = pistas[i].equals(resultado);
            if (ok) correctos++;

            System.out.println("Prueba " + (i + 8) + ": "
                    + (ok ? "OK" : "ERROR")
                    + " | Obtenido: " + resultado
                    + " | Esperado: " + pistas[i]);
        }

        System.out.println("\n" + correctos + "/" + total + " correctos");
    }
}
