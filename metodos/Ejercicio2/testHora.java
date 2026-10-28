package metodos.Ejercicio2;

public class testHora {
    public static void main(String[] args) {

        System.out.println("--- Constructores ---");
        Hora h1 = new Hora();               // vacío
        Hora h2 = new Hora(10, 30, 15);     // valores fijos
        Hora h3 = new Hora(h2);             // copia de h2
        Hora h4 = new Hora("actual");       // hora del sistema
        h1.visualizar();                    // 00:00:00
        h2.visualizar();                    // 10:30:15
        h3.visualizar();                    // 10:30:15
        h4.visualizar();                    // la hora real de tu ordenador

        System.out.println("--- Texto distinto de \"actual\" ---");
        Hora h5 = new Hora("hola");         // imprime el aviso
        h5.visualizar();                    // 00:00:00

        System.out.println("--- La copia es independiente ---");
        h3.setHora(1, 2, 3);
        h2.visualizar();                    // sigue 10:30:15
        h3.visualizar();                    // 01:02:03

        System.out.println("--- setHora (los tres valores) ---");
        h1.setHora(23, 59, 59);
        h1.visualizar();                    // 23:59:59 (límite válido)
        h1.setHora(24, 0, 0);               // Hora incorrecta
        h1.setHora(12, 60, 0);              // Hora incorrecta
        h1.setHora(12, 30, -1);             // Hora incorrecta
        h1.visualizar();                    // sigue 23:59:59: no se cambió NADA
        h1.setHora(0, 0, 0);
        h1.visualizar();                    // 00:00:00 (el 0 es válido)

        System.out.println("--- Setters individuales ---");
        h2.setHora(24);                     // Hora incorrecta
        h2.setMinuto(60);                   // Minuto incorrecto
        h2.setSegundo(-1);                  // Segundo incorrecto
        h2.visualizar();                    // sigue 10:30:15
        h2.setHora(0);
        h2.setMinuto(0);
        h2.setSegundo(0);
        h2.visualizar();                    // 00:00:00

        System.out.println("--- Segundos desde medianoche ---");
        h1.setHora(0, 0, 0);
        System.out.println(h1.segundosMedianoche());    // 0
        h1.setHora(1, 0, 0);
        System.out.println(h1.segundosMedianoche());    // 3600
        h1.setHora(10, 30, 15);
        System.out.println(h1.segundosMedianoche());    // 37815
        h1.setHora(23, 59, 59);
        System.out.println(h1.segundosMedianoche());    // 86399
    }
}
