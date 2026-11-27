
package ejBucles.ej2;

public class TestEj2 {
    public static void main(String[] args) {
        Ej2 ejercicio = new Ej2();
        int resultado = ejercicio.sumarPrimerosDiez();

        System.out.println(resultado == 55
            ? "PASS: resultado = 55"
            : "FAIL: esperado 55, obtenido " + resultado);
    }
}
