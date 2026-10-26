package metodos.mates;

public class Mates {
    public static String saludar(String mensaje, int veces) {
        String resultado = "";
        for (int cont = 1; cont <= veces; cont++) {
            resultado = resultado + "\t" + mensaje;
        }
        return resultado;
    }
}