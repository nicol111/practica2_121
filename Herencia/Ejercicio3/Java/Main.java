package Herencia.Ejercicio3.Java;

public class Main {
    public static void main(String[] args) {
    System.out.println("\n------ Objetos Persona: ------"); 
    System.out.println("\nEstudiante 1");

    Estudiante e1 = new Estudiante ("Juan", "Perez", 123456, 78945612, 10, 4, 1998, 1001, 1, "2017-02-20");
    e1.mostrar();
    System.out.println("\nEstudiante 2");
    Estudiante e2 = new Estudiante ("Maria", "Lopez", 223344, 78451236, 25, 8, 2002, 1002, 3, "2021-03-15");
    e2.mostrar();

    System.out.println("\nDocente 1");
    Docente d1 = new Docente ("Carlos", "Perez", 998877, 74589632, 30, 12, 1980, "123-NIT", "Ingeniero", "Sistemas", "M");
    d1.mostrar();
    System.out.println("\nDocente 2");
    Docente d2 = new Docente ("Ana", "Garcia", 112233, 71234567, 5, 6, 1985, "456-NIT", "Licenciada", "Matemáticas", "F");
    d2.mostrar();
    e1.mayor25();

    System.out.println("\n--------Estudiantes mayores de 25 años:---------");
    e2.mayor25();
    System.out.println("\n------ Docente Masculino Ingeniero Mayor de todos: ---- -");
    Docente mayor;
    if (d1.getEdad () >= d2.getEdad()) { mayor = d1; }
    else { mayor = d2; }
    if (mayor.getProfesion().equals("Ingeniero") && mayor.getSexo ().equals("M")) {
        mayor.mostrar();
    } 
    else { System.out.println("No hay docente masculino ingeniero mayor."); }


    System.out.println("\n-----Docentes y Estudiantes con el mismo Apellido: ----------");
    compararApellido (e1, d1);
    compararApellido (e1, d2);
    compararApellido (e2, d1);
    compararApellido (e2, d2);
}
    public static void compararApellido (Persona p1, Persona p2) {
        if (p1.getApe().equalsIgnoreCase(p2.getApe())) {
            System.out.println("\nCoincidencia detectada:");
            System.out.println(p1.getNom()+" y "+p2.getNom()+" comparten el Apellido");
                
        }
    }
}
