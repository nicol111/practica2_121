package Composicion_y_Agregacion.Ejercicio5;

public class Defensa extends Jugador {
    private String habilidad_especial;
    public Defensa (String nombre, int numero, String habilidad) {
        super(nombre, "Defensa", numero);
        this.habilidad_especial = habilidad;
    }

    void mostrar_info() {
    super.mostrar_info();
    System.out.println("Habilidad especial: "+ habilidad_especial);
    }
}
