import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        char firstAnswear, secondAnswear, thirdAnswear;
        Scanner sc = new Scanner(System.in);
        System.out.println("Responde a las siguientes preguntas con S o N");
        System.out.print("");
        System.out.println("¿Colón descubrió América?");
        firstAnswear = sc.next().charAt(0);
        if (firstAnswear == 'S') {
            System.out.println("Muy bien, siguiente pregunta: ");
            System.out.println("¿Es París capital de Bélgica?");
            secondAnswear = sc.next().charAt(0);
            if (secondAnswear == 'N') {
                System.out.println("Excelente, siguiente pegunta");
                System.out.println("¿Los beatles era un grupo de rock americano?: ");
                thirdAnswear = sc.next().charAt(0);
                sc.close();
                if (thirdAnswear == 'N') {
                    System.out.println("¡FELICIDADES! Has ganado el juego.");
                } else {
                    System.out.println("Has fallado la última pregunta");
                }
            } else {
                System.out.println("Has fallado la segunda pregunta");
            }
        } else {
            System.out.println("Has fallado la primera pregunta");
        }
    }
}