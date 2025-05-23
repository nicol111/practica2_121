package Composicion_y_Agregacion.Ejercicio5;

public class Delantero extends Jugador { 
    private String habilidad_especial;

    public Delantero(String nombre, int numero, String habilidad) { 
        super (nombre, "Delantero", numero);
        this.habilidad_especial = habilidad;
    }

    void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad especial: " + habilidad_especial);
}
}
