import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int horaInicio, minutosInicio, horaFin, minutosFin;
        int totalMinutosInicio, totalMinutosFin, diferenciaMinutos;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la hora de inicio (0-23): ");
        horaInicio = sc.nextInt();
        System.out.print("Ingrese los minutos de inicio (0-59): ");
        minutosInicio = sc.nextInt();

        System.out.print("Ingrese la hora de fin (0-23): ");
        horaFin = sc.nextInt();
        System.out.print("Ingrese los minutos de fin (0-59): ");
        minutosFin = sc.nextInt();
        sc.close();

        // Validación de la entrada
        if (horaInicio < 0 || horaInicio > 23 || minutosInicio < 0 || minutosInicio > 59 ||
            horaFin < 0 || horaFin > 23 || minutosFin < 0 || minutosFin > 59) {
            System.out.println("Error: Las horas deben estar entre 0 y 23 y los minutos entre 0 y 59.");
            return;
        }

        // Convertir todo a minutos
        totalMinutosInicio = horaInicio * 60 + minutosInicio;
        totalMinutosFin = horaFin * 60 + minutosFin;

        // Calcular la diferencia en minutos
        diferenciaMinutos = totalMinutosFin - totalMinutosInicio;

        // Si la diferencia es negativa, significa que la hora de fin es al día siguiente
        if (diferenciaMinutos < 0) {
            diferenciaMinutos += 24 * 60; // Añadir un día completo en minutos
        }

        System.out.println("La diferencia en minutos es: " + diferenciaMinutos);
    }
}
