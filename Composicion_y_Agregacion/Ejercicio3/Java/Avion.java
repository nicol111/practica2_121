package Composicion_y_Agregacion.Ejercicio3.Java;

public class Avion { 
    private String modelo;
    String fabricante; 
    Parte[] partes;
    int cont;

    public Avion (String modelo, String fabricante, int capacidad) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new Parte[capacidad]; 
        cont = 0;
    }

    void agregar_parte (Parte p) {
        if (cont< partes.length) {
            partes[cont] = p;
            cont++; }
        else { System.out.println("No se pueden agregar más partes al avión."); 
    }
}

    void mostrar_avion(){
        System.out.println("\nModelo: " + modelo); 
        System.out.println("Fabricante: " + fabricante); 
        System.out.println("\n----Partes del avión:----"); 
        for (int i = 0; i < cont; i++) {
            partes[i].mostrar_info();
    }
        
    }   

    String getModelo() { return modelo; } 
    String getFabricante() { return fabricante; }
}
