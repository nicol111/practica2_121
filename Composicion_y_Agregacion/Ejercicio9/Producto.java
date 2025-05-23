package Composicion_y_Agregacion.Ejercicio9;


public class Producto {
    private String nombre;
    double precio;

    public Producto (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    void mostrar_info() { 
        System.out.println("Producto: " + nombre);
        System.out.println(" Precio:" + precio);
    }
}

    
