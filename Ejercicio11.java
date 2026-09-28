import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        char option = ' ';
        double area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Quieres calcular Circulo (C) o Rectángulo (R)?: ");
        option = sc.next().charAt(0);

        switch (option) {
            case 'C':
                double radio = 0;
                System.out.print("Ingrese el radio del círculo: ");
                radio = sc.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + area);
                break;
            case 'R':
                double base = 0, altura = 0;
                System.out.print("Ingrese la base: ");
                base = sc.nextDouble();
                System.out.print("Ingrese la altura: ");
                altura = sc.nextDouble();
                area = base * altura;
                System.out.println("El área del rectángulo es: " + area);
                break;
            default:
                System.out.println("Debes escribir C o R");
        }
    }
}
