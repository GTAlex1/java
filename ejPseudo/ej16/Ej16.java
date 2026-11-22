
/*
    En un juego se formulas tres preguntas,
    una tras otra, a las que se debe responder
    "SI" o "NO".

    Si se responde mal a cualquiera de ella
    ya no se pregunta la siguiente y termina
    el juego.

    Si se llegan a acertar las tres se
    visualizará el mensaje: "Usted ha ganado".

    Las preguntas son:
    ¿Colón descubrió América?
    ¿Es París capital de Bélgica?
    ¿Los Beatles era un grupo de rock americano?
*/

package ejPseudo.ej16;

public class Ej16 {

    public String jugar(String respuesta1, String respuesta2, String respuesta3) {
        if (!respuesta1.equalsIgnoreCase("Si")) { // 1. Comprueba la primera respuesta. Si es incorrecta, termina.
            return "Respuesta incorrecta";
        } else if (!respuesta2.equalsIgnoreCase("No")) { // 2. Comprueba la segunda respuesta. Si es incorrecta,
                                                         // termina.
            return "Respuesta incorrecta";
        } else if (!respuesta3.equalsIgnoreCase("No")) { // 3. Comprueba la tercera respuesta. Si es incorrecta,
                                                         // termina.
            return "Respuesta incorrecta";
        } else {
            return "Usted ha ganado"; // 4. Si las tres son correctas, devuelve "Usted ha ganado".
        }
    }
}
