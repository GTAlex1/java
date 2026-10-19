import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioFamiliasMas3Hijos = 0;
        int codigoMayorNumeroHijos = 0;
        int mayorNumeroHijos = 0;
        int familiasMas3Hijos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Código de la familia " + i + ": ");
            int codigo = sc.nextInt();
            System.out.println("Salario de la familia " + i + ": ");
            double salario = sc.nextDouble();
            System.out.println("Número de hijos de la familia " + i + ": ");
            int numeroHijos = sc.nextInt();
            int varonesMayoresDeEdad = 0; 
            int edadMinima = 100; 

            for (int j = 1; j <= numeroHijos; j++) {
                System.out.println("Edad del hijo " + j + ": ");
                int edad = sc.nextInt();
                System.out.println("Sexo del hijo " + j + " (M/F): ");
                char sexo = Character.toUpperCase(sc.next().charAt(0));
                if (sexo == 'M' && edad >= 18) {
                    varonesMayoresDeEdad++;
                }
                if (edad < edadMinima) {
                    edadMinima = edad;
                }
            }
            if (numeroHijos > 3) {
                salarioFamiliasMas3Hijos += salario;
                familiasMas3Hijos++;
            }
            if (numeroHijos > mayorNumeroHijos) {
                mayorNumeroHijos = numeroHijos;
                codigoMayorNumeroHijos = codigo;
            }
            System.out.println("Familia " + codigo + ": varones mayores de edad: " + varonesMayoresDeEdad);
            System.out.println("Familia " + codigo + ": edad mínima: " + edadMinima);
        }
        System.out.println("Salario medio de las familias con más de 3 hijos: " + (salarioFamiliasMas3Hijos / familiasMas3Hijos));
        System.out.println("Código de la familia con más hijos: " + codigoMayorNumeroHijos);
        sc.close();
    }
}