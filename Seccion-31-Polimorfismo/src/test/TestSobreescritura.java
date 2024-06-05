package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        
       //Objeto apuntando hacia la clase padre Emapleado 
       Empleado empleado = new Empleado("Juan", 5000);
       //System.out.println("empleado = " + empleado.obtenerDetalles());
       imprimir(empleado);

       //Objeto apuntando hacia la clase Hija gerente usara el metodo sobreescrito
       Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
       //System.out.println("gerente = " + gerente.obtenerDetalles());
       imprimir(gerente);
       
       //Reutilizamos la variable empleado para que ahora apunte hacia el objeto de la clase gerente
       empleado = new Gerente("Gabriel", 50000, "Sistemas");
       imprimir(empleado);
    }
    
    //El metodo se comportara dependiendo de hacia donde apunte el objeto que se le da como parametro
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("empleado = " + detalles);
    }
}
