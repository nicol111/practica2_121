package Herencia.Ejercicio3.Java;

public class Docente extends Persona {
    private String nit, profesion, especialidad, sexo;

    public Docente(String nom, String ap, int ci, int cel, int d, int m, int a, String nit, String profesion, String especialidad, String sexo) {
        super(nom, ap, ci, cel, d, m, a);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;

}
    void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesion); 
        System.out.println("Especialidad: " + especialidad); 
        System.out.println("Sexo:"+ sexo);
    }

    String getProfesion() { return profesion; } 
    String getSexo() { return sexo; }
}