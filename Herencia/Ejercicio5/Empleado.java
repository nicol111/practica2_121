package Herencia.Ejercicio5;

public class Empleado { 

    protected String nombre, apellido; 
    int años_antiguedad;
    int salario_base;
    
    public Empleado (String n, String a, int s, int an){
        this.nombre=n;
        this.apellido=a;
        this.salario_base=s;
        this.años_antiguedad=an;
}

    void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Salario base: "+salario_base); 
        System.out.println("Años de antiguedad: "+años_antiguedad);
    }

    double calculars(){
        double ext = (salario_base * 0.05);
        ext = ext * años_antiguedad;
        double exTot = salario_base + ext;
        return exTot;
    }

    void mostSala(){
    System.out.println(nombre+" "+apellido+" tiene un salario total de: "+calculars());
    }
}
