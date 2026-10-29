package metodos.Ejercicio3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fecha {
    private int day;
    private int month;
    private int year;

    public Fecha(String name) {
        if (name.equals("actual")) {
            LocalDate hoy = LocalDate.now();
            this.day = hoy.getDayOfMonth();
            this.month = hoy.getMonthValue();
            this.year = hoy.getYear();
        } else {
            System.out.println("Introduce \"actual\" para poner la fecha actual");
        }
    }

    public Fecha(int day, int month, int year) {
        try {
            LocalDate.of(year, month, day);
            this.day = day;
            this.month = month;
            this.year = year;
        } catch (DateTimeException e) {
            System.out.println("Fecha incorrecta");
        }
    }

    public Fecha(Fecha otro) {
        this.day = otro.day;
        this.month = otro.month;
        this.year = otro.year;
    }

    public Fecha() {
        day = 0;
        month = 0;
        year = 0;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long diferencia(Fecha otro) {
        LocalDate inicio = LocalDate.of(this.year, this.month, this.day);
        LocalDate fin = LocalDate.of(otro.year, otro.month, otro.day);
        return Math.abs(ChronoUnit.DAYS.between(inicio, fin));
    }
}
