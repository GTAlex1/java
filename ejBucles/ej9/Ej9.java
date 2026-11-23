// Pedir que se introduzcan caracteres por teclado ($ para terminar) y visualizar el número de aes introducidas (mayúsculas o minúsculas).

package ejBucles.ej9;

public class Ej9 {

    public int contarAes(String texto) {
        int contador=0;
        for (int i=0; i<texto.length(); i++){
            char a = texto.charAt(i);
            if(a == 'a' || a == 'A'){contador++;}
            if(a == '$'){break;}
        }
        return contador;
    }
}
