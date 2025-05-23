package Composicion_y_Agregacion.Ejercicio5;

public class Jugador { 
    protected String nombre, posicion; 
    int numero;

    public Jugador (String nombre, String posicion, int numero) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numero = numero;
    }

    void mostrar_info() {
        System.out.println("Jugador: " + nombre); 
        System.out.println("Número: " + numero);
        System.out.println("Posición: " + posicion);
    }
}
