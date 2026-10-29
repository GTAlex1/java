package metodos.Ejercicio3;

public class testFecha {
    public static void main(String[] args) {

        System.out.println("--- Constructores y toString ---");
        Fecha f1 = new Fecha(15, 3, 2000);
        Fecha f2 = new Fecha(5, 3, 2000);
        Fecha f3 = new Fecha(f1);              // copia
        Fecha f4 = new Fecha("actual");        // fecha de hoy
        System.out.println(f1);                // 15/03/2000
        System.out.println(f2);                // 05/03/2000 (con cero delante)
        System.out.println(f3);                // 15/03/2000
        System.out.println(f4);                // la fecha de hoy de tu ordenador

        System.out.println("--- La copia es independiente ---");
        f3.setDay(20);
        System.out.println(f1);                // sigue 15/03/2000
        System.out.println(f3);                // 20/03/2000

        System.out.println("--- Setters y getters ---");
        f1.setDay(20);
        f1.setMonth(5);
        f1.setYear(2010);
        System.out.println(f1);                // 20/05/2010
        System.out.println(f1.getDay() + " " + f1.getMonth() + " " + f1.getYear());   // 20 5 2010

        System.out.println("--- Validación con setFecha ---");
        Fecha v = new Fecha(1, 1, 2000);
        v.setFecha(29, 2, 2000);               // válida: el 2000 fue bisiesto
        System.out.println(v);                 // 29/02/2000
        v.setFecha(29, 2, 2001);               // Fecha incorrecta (2001 no es bisiesto)
        v.setFecha(31, 4, 2000);               // Fecha incorrecta (abril tiene 30 días)
        v.setFecha(0, 1, 2000);                // Fecha incorrecta
        v.setFecha(15, 13, 2000);              // Fecha incorrecta
        System.out.println(v);                 // sigue 29/02/2000: no se cambió nada

        System.out.println("--- diferencia (días) ---");
        System.out.println(new Fecha(1, 1, 2000).diferencia(new Fecha(11, 1, 2000)));   // 10
        System.out.println(new Fecha(11, 1, 2000).diferencia(new Fecha(1, 1, 2000)));   // 10 (orden inverso)
        System.out.println(new Fecha(1, 1, 2000).diferencia(new Fecha(1, 1, 2000)));    // 0
        System.out.println(new Fecha(28, 2, 2000).diferencia(new Fecha(1, 3, 2000)));   // 2 (año bisiesto)
        System.out.println(new Fecha(28, 2, 2001).diferencia(new Fecha(1, 3, 2001)));   // 1
        System.out.println(new Fecha(1, 1, 2000).diferencia(new Fecha(1, 1, 2001)));    // 366

        System.out.println("--- Fecha vacía no debe romper el programa ---");
        System.out.println(new Fecha().diferencia(new Fecha(1, 1, 2000)));   // 10957 si tu vacío es 01/01/1970
    }
}
