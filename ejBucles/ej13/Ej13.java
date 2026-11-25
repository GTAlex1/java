
/*
    Pedir un número por teclado que habrá que adivinar posteriormente
    de la siguiente forma: Se leerán números hasta que uno sea igual
    al número a adivinar o hasta que se alcancen 5 intentos.

    Mientras no se adivine el número habrá que visualizar:
    "El número a adivinar es mayor ( o menor ) que el que acabas
    de introducir".

    Finalmente, escribir la cantidad de intentos en que se adivinó
    en número.
*/

package ejBucles.ej13;

public class Ej13 {

    public int adivinarNumero(int numero, int[] intentos) {
        int i;
        for (i = 0;i<Math.min(5, intentos.length) && intentos[i] != numero; i++) {/*i = intento */}
        return i>=Math.min(5, intentos.length) ? -1 : i+1;

    }

    public String obtenerPista(int numero, int intento) {
        if (numero>intento) {return "Mayor";
        } else if (numero<intento){return "Menor";
        } else {return "Correcto";} 
    }
}
