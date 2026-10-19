import java.util.ArrayList;

public class Principal {
    // 1. Creamos el "molde" Coche en una sola línea (guarda marca y los 3 datos int)
    public record Coche(String marca, int gasolina, int potencia, int velMaxima) {}

    public static void main(String[] args) {
        // 2. Creamos el ArrayList que va a almacenar "Coches"
        ArrayList<Coche> listaCoches = new ArrayList<>();

        // 3. Añadimos el Mercedes y los demás con sus datos int
        listaCoches.add(new Coche("Mercedes", 65, 421, 270));
        listaCoches.add(new Coche("Audi", 60, 340, 250));
        listaCoches.add(new Coche("BMW", 62, 374, 250));

        // 4. Sacamos el Mercedes (posición 0) y guardamos sus datos en variables int
        Coche miMercedes = listaCoches.get(0);
        
        int gasolinaMercedes = miMercedes.gasolina();
        int potenciaMercedes = miMercedes.potencia();
        int velocidadMercedes = miMercedes.velMaxima();

        // 5. Mostramos los datos por pantalla
        System.out.println("Has consultado el: " + miMercedes.marca());
        System.out.println(" -> Capacidad Gasolina: " + gasolinaMercedes + "L");
        System.out.println(" -> Potencia Motor: " + potenciaMercedes + " CV");
        System.out.println(" -> Velocidad Máxima: " + velocidadMercedes + " km/h");
    }
}
