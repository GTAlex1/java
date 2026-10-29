/*
Cree una clase llamada Corredor, que permita manejar la información de una atleta del
que interesa conocer: nombre, sexo, fecha de nacimiento, (utilice la clase Fecha
creada en un anterior ejercicio), y tiempo empleado (clase Hora). La clase debe
manejar eficientemente la información y ocultarla perfectamente.
a. Constructor que inicialice todos los datos.
b. Método que retorne cuantos corredores existen en un determinado momento.
c. Método toString.
d. Método que retorne un boolean para saber si el corredor es mayor de edad.
e. Métodos set’s y get’s
*/

package metodos.Ejercicio3;

import metodos.Ejercicio2.Hora;

public class Corredor {
    private String nombre;
    private char sexo;
    private Fecha fechaNacimiento;
    private Hora tiempo;
}
