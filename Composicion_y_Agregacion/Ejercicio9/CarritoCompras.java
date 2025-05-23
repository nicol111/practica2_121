package Composicion_y_Agregacion.Ejercicio9;

public class CarritoCompras { 
    private
    Producto[] productos; 
    int cont;
  
    public CarritoCompras () {
        productos = new Producto [10]; 
        cont = 0;
    }

    void agregar_producto (Producto p) { 
        if (cont < productos.length) { 
            productos [cont] = p;
            cont++;
    }
        
    else {
        System.out.println("No se pueden agregar más productos. Límite alcanzado.");
    }
}

    void mostrar_carrito() {
    System.out.println("\n--- Carrito de Compras ---"); 
    for (int i = 0; i < cont; i++) {
        System.out.println("\n----Producto--------" + (i + 1) +"------"+ (i + 1)+ "-------");
                productos[i].mostrar_info();
    
    }
    }}
