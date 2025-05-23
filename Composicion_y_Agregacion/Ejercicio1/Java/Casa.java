package Composicion_y_Agregacion.Ejercicio1.Java;

public class Casa { 
    private String direccion;
    Habitacion[] habitaciones;
    int cont;


    public Casa (String direc, int capa) {
        this.direccion = direc;
        this.habitaciones = new Habitacion[capa]; 
        cont = 0;
    }

    void agregar_habitacion (Habitacion h) { 
        if (cont< habitaciones.length) {
            habitaciones [cont] = h;
            cont++;
    } else {
        System.out.println("No se pueden agregar más habitaciones.");
    }
}

    void mostrar_casa() {
        System.out.println("\nDirección: " + direccion);
        System.out.println("\n----Habitaciones:----");
        for (int i = 0; i < cont; i++) {
            habitaciones[i].mostrar_casa();
    }
}

    String getDireccion() { return direccion; }

}   
