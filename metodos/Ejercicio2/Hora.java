package metodos.Ejercicio2;

import java.time.LocalTime;

public class Hora {
    private int hora, minuto, segundo;

    public Hora(int hora, int minuto, int segundo) { //Constructor de valores fijos
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Hora(){ // Constructor de valores vacíos
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public Hora(Hora otro) { // Constructor para copiar otro valor
        this.hora = otro.hora;
        this.minuto = otro.minuto;
        this.segundo = otro.segundo;
    }

    public Hora(String texto) { //Hora actual del sistema
        if (texto.equals("actual")) {
            LocalTime lt = LocalTime.now();
            this.hora = lt.getHour();
            this.minuto = lt.getMinute();
            this.segundo = lt.getSecond();
        } else {
            System.out.println("Debe escribir \"actual\" para darle la hora del sistema");
        }
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora, int minuto, int segundo) { // Setter único para todo, poteriormente setter para cada cosa
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            System.out.println("Hora incorrecta");
        }
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora incorrecta");
        }
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto incorrecto");
        }
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo incorrecto");
        }
    }

    public void visualizar(){
        String fecha = String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
        System.out.println("La hora es " + fecha);
    }

    public int segundosMedianoche() {
        return this.hora*3600 + this.minuto*60 + this.segundo;
    }
}
