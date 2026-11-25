package ejBucles.ej15;

public class TestEj15 {
    public static void main(String[] args) {
        Ej15 ej = new Ej15();

        int[] numeros = { 6, 28, 496, 8128, 12, 7, 1, 0, -6 };

        boolean[] esperados = {
                true, true, true, true,
                false, false, false, false, false
        };

        int correctos = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean resultado = ej.esPerfecto(numeros[i]);
            boolean ok = resultado == esperados[i];

            if (ok)
                correctos++;

            System.out.println("Prueba " + (i + 1) + ": "
                    + (ok ? "OK" : "ERROR")
                    + " | Obtenido: " + resultado
                    + " | Esperado: " + esperados[i]);
        }

        System.out.println("\n" + correctos + "/"
                + numeros.length + " correctos");
    }
}
