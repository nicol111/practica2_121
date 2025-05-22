package Herencia.Ejercicio1.Java;


public class Main {
public static void main(String[] args) {
    Coche c1 = new Coche("Changan", "Waer3", 2000, 30000, "Gas", 6); 
    Coche c2 = new Coche ("Toyota", "Yaris", 2025, 28000, "Híbrido", 4); 
    Moto m1 = new Moto("Yamaha", "CR21", 2025, 23000, "13", "HkR3");

    System.out.println("-----Vehículos:------ -");
    System.out.println("Coche 1:");
    c1.mostrar_info();
    System.out.println("\nCoche 2:");
    c2.mostrar_info();
    System.out.println("\nMoto 1: ");
    m1.mostrar_info();

    
    System.out.println("\nLos Coches con mas de 4 puertas son:");
    c1.masDe4();
    c2.masDe4();

    System.out.println("\nLos vehiculos de modelo actual (2025) son: ");
    c1.mod2025();
    c2.mod2025();
    m1.mod2025();

    }
}