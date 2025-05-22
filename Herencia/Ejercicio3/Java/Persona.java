package Herencia.Ejercicio3.Java;

public class Persona {
    protected String nombre, apellido;
    int ci, celular;
    int diaNac, mesNac, añoNac;

    public Persona (String nom, String ap, int ci, int cel, int d, int m, int a) {
        this.nombre = nom;
        this.apellido = ap; 
        this.ci = ci;
        this.celular = cel;
        this.diaNac = d;
        this.mesNac = m;
        this.añoNac = a;
        }
    int getEdad() {
        int diaAct = 13;
        int mesAct = 5;
        int añoAct = 2025;
        int edad = añoAct - añoNac;
        if (mesNac > mesAct || (mesNac == mesAct && diaNac > diaAct)) {
            edad--;
        }
        return edad;
        
}
    void mostrar() {
        System.out.println("Nombre y Apellido:" + nombre +"" + apellido); 
        System.out.println("CI:" + ci);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha de nacimiento: "+diaNac+"/"+mesNac+"/"+añoNac); 
        System.out.println("Edad:"+ getEdad());
}

    String getApe() { return apellido; } 
    String getNom() { return nombre; }

    void mayor25() {
        if(getEdad()>25){
            System.out.println(nombre + ""+ apellido + "tiene" + getEdad());
        }
    }
}
