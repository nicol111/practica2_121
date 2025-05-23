package Composicion_y_Agregacion.Ejercicio5;

public class Main {
    public static void main(String[] args) {
    System.out.println("-------Equipo: -------"); 
    Equipo eq = new Equipo ("Tigres FC", 5);
    eq.agregar_jugador (new Portero ("Carlos", 1, "Atajadas")); 
    eq.agregar_jugador (new Defensa ("Luis", 3, "Marcaje")); 
    eq.agregar_jugador (new Mediocampista ("Jorge", 8, "Pases")); 
    eq.agregar_jugador (new Delantero ("Raul", 9, "Goles"));
    eq.mostrar_equipo();

}}
