package Herencia.Ejercicio5;

public class Desarrollador extends Empleado { 
    private String lenguaje_programacion;
    int horas_extras;

   public Desarrollador(String n, String a, int s, int an, String l, int h) {
    super(n, a, s, an); 
    this.lenguaje_programacion = l; 
    this.horas_extras = h;
}

    void mostrar() {
        super.mostrar();
        System.out.println("Lenguaje de programacion: "+lenguaje_programacion); 
        System.out.println("Horas extra: "+ horas_extras);
        
    }

    double calculars() {
        double sh = salario_base / 160;
        sh = sh* horas_extras;
        double exTot = sh + super.calculars(); 
        return exTot;
    }

    void mas10H(){
        if(horas_extras>10){
            System.out.println(nombre + "" + apellido + " trabaja: " + horas_extras + "h extras");
        }
    }
}


