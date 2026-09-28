import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        byte edad;
        System.out.println("Ingrese su edad: ");
        Scanner entrada = new Scanner(System.in);
        edad = entrada.nextByte();
        entrada.close();

        System.out.println((220-edad)/6);
    }
}

