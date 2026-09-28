import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int salario=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el salario: ");
        salario = sc.nextInt();
        sc.close();

        System.out.println("El salario de Ginecología será: " + (salario * 0.40));
        System.out.println("El salario de Traumatología será: " + (salario * 0.30));
        System.out.println("El salario de Pediatría será: " + (salario * 0.30));
    }
}
