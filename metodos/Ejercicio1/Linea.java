package metodos.Ejercicio1;

public class Linea {
    private Punto inicio;
    private Punto fin;

    public Linea(Punto inicio, Punto fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public void mostrar() {
        inicio.mostrar("Inicio");
        fin.mostrar("Fin");
    }

    public Punto getInicio() {
        return this.inicio;
    }

    public Punto getFin()  {
        return this.fin;
    }

    public void setInicio(Punto inicio) {
        this.inicio = inicio;
    }

    public void setFin(Punto fin) {
        this.fin = fin;
    }

    public double distancia(){
        return inicio.distancia(fin);
    }
}
