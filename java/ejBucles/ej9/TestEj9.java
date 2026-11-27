
package ejBucles.ej9;

public class TestEj9 {
    public static void main(String[] args) {
        Ej9 ej = new Ej9();

        String[] entradas = {
                "Casa Amarilla$AAA",
                "AAAA",
                "Hola mundo$aaa",
                "$aaaa",
                "Java",
                "",
                "bbbCCC",
                "aAaA$Aa"
        };

        int[] esperados = {
                5, 4, 1, 0, 2, 0, 0, 4
        };

        for (int i = 0; i < entradas.length; i++) {
            int resultado = ej.contarAes(entradas[i]);

            System.out.println(
                    "Prueba " + (i + 1) + ": " +
                            (resultado == esperados[i] ? "PASS" : "FAIL")
                            + " | Resultado: " + resultado
                            + " | Esperado: " + esperados[i]);
        }
    }
}
