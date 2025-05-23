package Composicion_y_Agregacion.Ejercicio1.Java;

public class Habitacion {
    private String nombre;
    double tamaño;

    public Habitacion (String nombre, double tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    void mostrar_casa() {
        System.out.println("\nHabitación: " + nombre); 
        System.out.println("Tamaño: " + tamaño + " m2");

    }

    String getNombre() { return nombre; } 
    double getTamaño() { return tamaño; }
    }