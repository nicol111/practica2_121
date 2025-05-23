package Composicion_y_Agregacion.Ejercicio7;

public class Main {
    public static void main(String[] args) {
    System.out.println("-- Universidad:----");
    Universidad uni = new Universidad ("Universidad Nacional", 5);

    Estudiante e1 = new Estudiante ("Ana Pérez", "Ingeniería", 3); 
    Estudiante e2 = new Estudiante ("Luis García", "Medicina", 5); 
    Estudiante e3 = new Estudiante ("Sofía Díaz", "Derecho", 2);

    uni.agregar_estudiante (e1);
    uni.agregar_estudiante (e2);
    uni.agregar_estudiante (e3);
    uni.mostrar_universidad();
    }
}
