
/*
    Programa que calcule el área, bien de un círculo,
    bien de un rectángulo.

    Pedirá que se introduzca C o R.

    Si se introdujo C, pedir el radio y visualizar área.
    Si se introdujo R, pedir base y altura y visualizar área.
*/

package ejPseudo.ej11;

public class Ej11 {

    public double areaCirculo(double radio) {

        return Math.PI * Math.pow(radio, 2);

    }

    public double areaRectangulo(double base, double altura) {

        return (base * altura);

    }

    public double calcular(char figura, double dato1, double dato2) {

        switch (figura) {
            case 'C':
                return areaCirculo(dato1);
            case 'R':
                return areaRectangulo(dato1, dato2);
            default:
                throw new IllegalArgumentException("Figura no válida (C o R)");
        }

    }
}
