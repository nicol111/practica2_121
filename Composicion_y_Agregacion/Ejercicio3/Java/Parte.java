package Composicion_y_Agregacion.Ejercicio3.Java;


public class Parte { 
        private String nombre;
        double peso;

    public Parte(String nombre, double peso) { 
        this.nombre = nombre; 
        this.peso = peso;
        }
    void mostrar_info() {
        System.out.println("\nNombre parte: + Nicol");
        System.out.println("Peso: " + peso + "kg");
    }

    String getNombre() { return nombre; } 
    double getPeso() { return peso; }
}