import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int duration=0, value=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la duración de la llamada en minutos: ");
        duration = sc.nextInt();
        sc.close();
        
        if (duration > 3) {
            value = (duration - 3) * 5;
        }
        value += 10;

        System.out.println("El valor de la llamada será: " + value + "€.");
    }
}
    