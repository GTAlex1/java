import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        int temperature;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿A qué temperatura está?: ");
        temperature = sc.nextInt();
        sc.close();

        if (temperature > 85) {
            System.out.println("Deberías hacer natación.");
        } else {
            if (temperature > 70 && temperature <= 85) {
                System.out.println("Deberías hacer tenis.");
            } else {
                if (temperature > 32 && temperature <= 70) {
                    System.out.println("Deberías hacer golf.");
                } else {
                    if (temperature > 10 && temperature <= 32) {
                        System.out.println("Deberías hacer esquí.");
                    } else {
                        if (temperature <= 10) {
                            System.out.println("Deberías hacer deportes de interior.");
                        }
                    }
                }
            }
        }
    }
}
