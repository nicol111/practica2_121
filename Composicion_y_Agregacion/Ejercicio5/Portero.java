package Composicion_y_Agregacion.Ejercicio5;


public class Portero extends Jugador { 
    private String habilidad_especial;

    public Portero (String nombre, int numero, String habilidad) {
        super(nombre, "Portero", numero);
        this.habilidad_especial = habilidad;
}

void mostrar_info() {
    super.mostrar_info();
    System.out.println("Habilidad especial:" + habilidad_especial);
}
}

