package ejPseudo;

public class TestEj1 {
    public static void main(String[] args) {
        Ej1 ejercicio = new Ej1();

        int[] entradas = { 8, -15, 0, -1, 1, 2147483647, -2147483647 };
        int[] esperados = { 8, 15, 0, 1, 1, 2147483647, 2147483647 };
        int superados = 0;

        for (int i = 0; i < entradas.length; i++) {
            int obtenido = ejercicio.valorAbsoluto(entradas[i]);
            boolean correcto = obtenido == esperados[i];
            if (correcto) {
                superados++;
            }
            System.out.println("Prueba " + (i + 1) + " | Entrada: " + entradas[i]
                    + " | Esperado: " + esperados[i]
                    + " | Obtenido: " + obtenido
                    + " | " + (correcto ? "OK" : "FALLO"));
        }

        System.out.println("Resultado: " + superados + "/" + entradas.length + " pruebas superadas.");
        System.out.println("Nota: Integer.MIN_VALUE (-2147483648) es un caso especial:");
        System.out.println("su valor absoluto no cabe en un int y Math.abs(int) devuelve el mismo valor negativo.");
    }
}
