import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        byte day = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7: ");
        day = sc.nextByte();
        sc.close();
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error: Valor fuera de rango");
        }
    }
}