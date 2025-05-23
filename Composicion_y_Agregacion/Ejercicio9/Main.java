package Composicion_y_Agregacion.Ejercicio9;

public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        carrito.agregar_producto (new Producto ("Leche", 7.50));
        carrito.agregar_producto (new Producto ("Pan", 3.00));
        carrito.agregar_producto (new Producto ("Queso", 15.25));

        carrito.mostrar_carrito();
    }
}
    
      
    
