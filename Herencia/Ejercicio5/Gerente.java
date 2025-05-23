package Herencia.Ejercicio5;

public class Gerente extends Empleado{
    private String departamento;
    int bono_gerencial;

    public Gerente(String n, String a, int s, int an, String d, int b) {
        super(n, a, s, an);
        this.departamento = d;
        this.bono_gerencial = b;
    }

    void mostrar() {
        super.mostrar();
        System.out.println("departamento: "+departamento); 
        System.out.println("Bono gerente: "+bono_gerencial);
    }

    double calculars() {
        double extrat=bono_gerencial+super.calculars();
        return extrat;
    }

    void mostbonoMay(){
        if(bono_gerencial>1000){
            System.out.println(nombre+" "+apellido+" tiene un bono de: "+bono_gerencial);
    }
}
}
