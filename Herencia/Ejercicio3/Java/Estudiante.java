package Herencia.Ejercicio3.Java;


public class Estudiante extends Persona {
    private int ru, semestre;
    String fecha_Ingreso;
    

    public Estudiante (String nom, String ap, int ci, int cel, int d, int m, int a, int ru, int sem, String fechaIng) {
        super(nom, ap, ci, cel, d, m, a);
        this.ru= ru;
        this.semestre = sem;
        this.fecha_Ingreso = fechaIng;
    }

    void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru);
        System.out.println("Semestre: " + semestre);
        System.out.println("Fecha de ingreso: " + fecha_Ingreso);
    }
}
