package Herencia.Ejercicio1.Java;

public class Coche extends Vehiculo {
    private String tipo_combustible;
    private int num_puertas;

    public Coche(String maa, String mo, int a, int p, String c, int t) {
        super(maa, mo, a, p);
        this.tipo_combustible = c;
        this.num_puertas = t;
    }

    public void mostrar_info() {

    super.mostrar_info();
    System.out.println("Tipo de combustible:" + tipo_combustible); 
    System.out.println("Número de puertas: " + num_puertas);
    }
    
    public void masDe4() {
    if (num_puertas > 4) { 
        System.out.println("-"+ getMarca() + " de " + getModelo() + " tiene " + num_puertas + " puertas.");

        }
    }
}

