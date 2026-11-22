
/*
    Resolver la ecuación cuadrática ax²+bx+c=0.
    Se pedirá la introducción de los coeficientes a, b y c
    y se visualizarán los resultados x1 y x2.

    Si la operación dentro de la raíz diera como resultado
    un número inferior a 0, visualizar:
    "La solución son dos números complejos conjugados".

    Si el divisor es 0, visualizar:
    "Error: División entre 0".

    Contáis con la función SQRT(expr), que calcula
    la raíz cuadrada de la expresión expr, siendo
    ésta positiva.

    Utiliza todas las variables intermedias que necesites.
*/

package ejPseudo.ej9;

public class Ej9 {

    public double[] resolver(double a, double b, double c) {

        // 1. Comprueba si el divisor es cero.
        if (a == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        // 2. Calcula el discriminante.
        double discriminante = b*b - 4*a*c;

        // 3. Comprueba si el discriminante es negativo.
        if (discriminante < 0) {
            throw new ArithmeticException("Discriminante negativo");
        }  else { // 4. Calcula las dos soluciones. y // 5. Devuelve ambas soluciones en un array.
            return new double[]{(-b+Math.sqrt(discriminante))/(2*a), (-b-Math.sqrt(discriminante))/(2*a)};
        }

    }
}
