package Composicion_y_Agregacion.Ejercicio1.Java;

public class Main {
    public static void main(String[] args) {
    System.out.println("-------Casa:------");
    Casa micasa = new Casa ("Calle Flores #123", 5); 
    Habitacion h1 = new Habitacion ("Sala", 20.0); 
    Habitacion h2 = new Habitacion ("Cocina", 12.5); 
    Habitacion h3 = new Habitacion ("Dormitorio", 15.0); 
    Habitacion h4 = new Habitacion ("Baño", 6.0);

    micasa.agregar_habitacion (h1);
    micasa.agregar_habitacion (h2);
    micasa.agregar_habitacion (h3);
    micasa.agregar_habitacion (h4);
    micasa.mostrar_casa();
    }
}
