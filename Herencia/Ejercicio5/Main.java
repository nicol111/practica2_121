package Herencia.Ejercicio5;

public class Main {
    public static void main(String[] args) {
    System.out.println("\n------ Objetos Empleado: --------");
    System.out.println("\nGerente 1");
    Gerente g1=new Gerente("juan", "perez", 2300,3,"supervision",900); 
    g1.mostrar();
    System.out.println("\nGerente 2");
    Gerente g2=new Gerente ("andrea","lima", 1880, 1, "almacen", 1200); 
    g2.mostrar();
    System.out.println("\nDesarrollador 1");
    Desarrollador d1=new Desarrollador("lina", "patt", 2300,6,"java",30); 
    d1.mostrar();
    System.out.println("\nDesarrollador 2");
    Desarrollador d2=new Desarrollador ("ana", "Lopez", 1880, 2, "python",6); 
    d2.mostrar();

    System.out.println("\n-----Salario Calculado de los Empleados:-----"); 
    g1.mostSala(); g2.mostSala(); d1.mostSala(); d2.mostSala();

    System.out.println("\n-----Gerentes con un bono gerencial mayor a 1000:-----");
    g1.mostbonoMay(); g2.mostbonoMay();

    System.out.println("\n-----Desarrolladores que trabajan mas de 10h extras:-----"); 
    d1.mas10H(); d2.mas10H();
    }
}

