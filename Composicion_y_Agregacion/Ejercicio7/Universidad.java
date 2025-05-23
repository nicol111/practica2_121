package Composicion_y_Agregacion.Ejercicio7;

public class Universidad { 
    private String nombre;
    Estudiante[] estudiantes;
    int cont;

    public Universidad(String nombre, int capacidad) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante [capacidad]; 
        cont = 0;
    }

    void agregar_estudiante (Estudiante est) { 
        if (cont< estudiantes.length) {
            estudiantes [cont] = est;
            cont++;
    } else {
        System.out.println("No se pueden agregar más estudiantes.");
    }
}

    void mostrar_universidad() {
        System.out.println("\ns<Universidad: " + nombre); 
        System.out.println("\n-----Listado de estudiantes:-----"); 
        for (int i = 0; i < cont; i++) {
            System.out.println("\n-----Estudiante " + (i + 1)+"-----"); 
            estudiantes[i].mostrar_info();
    }
}
}
