
package ejBucles.ej1;

import java.util.Arrays;

public class TestEj1 {

    public static void main(String[] args) {
        Ej1 ejercicio = new Ej1();
        int[] resultado = ejercicio.obtenerPares();

        int superadas = 0;
        int total = 53;

        if (resultado.length == 49)
            superadas++;

        for (int i = 0; i < 49; i++) {
            if (resultado[i] == (i + 1) * 2) {
                superadas++;
            }
        }

        if (resultado[0] == 2)
            superadas++;
        if (resultado[24] == 50)
            superadas++;
        if (resultado[48] == 98)
            superadas++;

        System.out.println("Resultado: " + superadas + "/" + total);

        System.out.println(
                "Array generado: " + Arrays.toString(resultado));
    }
}
