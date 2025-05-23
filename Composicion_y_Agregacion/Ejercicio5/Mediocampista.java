package Composicion_y_Agregacion.Ejercicio5;

public class Mediocampista extends Jugador {
    private String habilidad_especial;

    public Mediocampista (String nombre, int numero, String habilidad) { super(nombre, "Mediocampista", numero);
        this.habilidad_especial = habilidad;
       
    }

    void mostrar_info() {
    super.mostrar_info();
    System.out.println("Habilidad especial: " + habilidad_especial);
    }
}
