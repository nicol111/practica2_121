package Composicion_y_Agregacion.Ejercicio7;

public class Estudiante {
    private String nombre; 
    String carrera;
    int semestre;

    public Estudiante (String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    void mostrar_info() {
    System.out.println("Nombre: " + nombre); 
    System.out.println("Carrera: " + carrera); 
    System.out.println("Semestre:"+ semestre);
    }
}
