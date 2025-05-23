package Composicion_y_Agregacion.Ejercicio3.Java;

public class Main {
    public static void main(String[] args) {
    System.out.println("-------Avion:------");
    Avion avion = new Avion ("Boeing 747", "Boeing", 5); 
    Parte motor = new Parte ("Motor", 1500.0);
    Parte alaIzq = new Parte ("Ala Izquierda", 800.0); 
    Parte alaDer = new Parte ("Ala Derecha", 800.0);
    Parte tren = new Parte("Tren de Aterrizaje", 500.0); 
    Parte cola = new Parte("Cola", 400.0);
    avion.agregar_parte (motor); 
    avion.agregar_parte(alaIzq); 
    avion.agregar_parte (alaDer);
    avion.agregar_parte(tren);
    avion.agregar_parte(cola); 
    avion.mostrar_avion();
    }
}

