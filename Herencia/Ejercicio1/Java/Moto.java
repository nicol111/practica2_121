package Herencia.Ejercicio1.Java;

public class Moto extends Vehiculo {
    private String cilindrada, tipo_motor;

    public Moto(String ma, String mo, int a, int p, String c, String t) {
        super(ma, mo, a, p);
        this.cilindrada = c;
        this.tipo_motor = t;
    }

    public void mostrar_info() {
    super.mostrar_info();
    System.out.println("Cilindrada de la moto: "+cilindrada); 
    System.out.println("Tipo de motor: "+tipo_motor);
}
}