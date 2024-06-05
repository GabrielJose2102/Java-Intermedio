package test;

import domain.*;

    //Aplicacion de polimorfismo

public class TestSobreescritura {
    public static void main(String[] args) {
        /*
        Empleado empleado = new Empleado("Juan", 10000);
        //System.out.println("empleado = " + empleado.ordenarDetalles());
        
        //Aqui estamos aplicando polimorfismo con el comportamiento de la clase Empleado "padre".
        imprimir(empleado);
        
        //Aqui estamos aplicando polimorfismo con el comportamiento de la clase Gerente "Hija".
        Gerente gerente = new Gerente("Gabriel", 6000, "Sistemas");
        //System.out.println("gerente1 = " + gerente1.ordenarDetalles());
        imprimir(gerente);*/
        
        Empleado empleado = new Empleado(10000);
        pagar(empleado);
        
        Gerente gerente = new Gerente(10000);
        pagar(gerente);
    }
    
    //Metodo donde se imprime la informacion dependiendo de la clase con la que interactue.
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.ordenarDetalles());
    }
    
    public static void pagar(Empleado empleado) {
        System.out.println("Sueldo Total Pagado al Empleado = " + empleado.pagarSueldo(empleado.getSueldo()));
    }
    
    
}
