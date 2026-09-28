import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int mujeres=0, hombres=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de mujeres: ");
        mujeres = sc.nextInt();
        System.out.println("Ingrese el número de hombres: ");
        hombres = sc.nextInt();
        sc.close();

        System.out.println("El porcentaje de mujeres es: " + (mujeres * 100.0 / (mujeres + hombres)) + "%");
        System.out.println("El porcentaje de hombres es: " + (hombres * 100.0 / (mujeres + hombres)) + "%");
    }
}
