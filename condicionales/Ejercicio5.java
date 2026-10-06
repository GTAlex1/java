import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int salario=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el salario: ");
        salario = sc.nextInt();
        sc.close();

        System.out.println("El salario con aumento es: " + (salario * 1.25));
    }
}
