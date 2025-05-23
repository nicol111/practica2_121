package Composicion_y_Agregacion.Ejercicio5;

public class Equipo { 
    private String nombre;
    Jugador[] jugadores; 
    int cont;

    public Equipo (String nombre, int maxJuga) { 
        this.nombre = nombre;
        jugadores = new Jugador [maxJuga]; 
        cont = 0;
    }
    void agregar_jugador (Jugador j) { 
        if (cont< jugadores.length) { 
            jugadores [cont] = j;
            cont++;
        } else {
            System.out.println("No se pueden agregar más jugadores.");
        }
}

    void mostrar_equipo() {
    System.out.println("Equipo:" + nombre);
    for (int i = 0; i < cont; i++) {
        System.out.println("\n----Jugador " +(i+1)+"----"); 
        jugadores[i].mostrar_info();
    }
    }
}
