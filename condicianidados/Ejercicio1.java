import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumaPrimera = 0;
        int contadorMayor8 = 0;
        double minGlobal = 11;
        int codigoMinGlobal = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Código del alumno " + i + ": ");
            int codigo = sc.nextInt();

            double max = 0; 
            double min = 11;

            for (int j = 1; j <= 5; j++) {
                System.out.println("Nota " + j + ": ");
                double nota = sc.nextDouble();
                max = (max < nota) ? nota : max;
                min = (min > nota) ? nota : min;
            
                if (j == 1) {
                    sumaPrimera += nota;
                }
            }
            
            System.out.println("Alumno " + codigo + " --> máx: " + max + ", mín: " + min);
            if (max > 8) {
                contadorMayor8++;
            }
            if (min < minGlobal) {
                minGlobal = min;
                codigoMinGlobal = codigo;
            }
        }
        sc.close();
        System.out.println("Media de las primeras notas: " + sumaPrimera / 10);
        System.out.println("Cantidad de alumnos con nota máxima mayor que 8: " + contadorMayor8);
        System.out.println("Alumno con nota mínima global: " + codigoMinGlobal + " (nota: " + minGlobal + ")");
    }
}