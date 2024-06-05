package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        //Declaracion de variable tipo Empleado.
        Empleado empleado;
        
        //Se cambia hacia que objeto apunta la variable.
        empleado = new Escritor("Juan", 20000, TipoEscritura.CLASICO);
//        System.out.println("empleado = " + empleado);
            
            /*Aqui se ejecuta el metodo en comun de la clase Empleado con la clase Escritor 
                pero con prioridad de la clase Escritor a la cual es donde esta apuntado
                la variable.
            */
          System.out.println(empleado.obtenerDetalles());

            
            /*Convertir una variable de tipo empleado a tipo Escritor
                ahora solo no esta apuntado hacia la clase Escritor sino que 
                la variable es de tipo Escritor.
            */
            //downcasting convertir de clase padre a clase hija
            //((Escritor)empleado).getTipoEscritura();
            
            //otra forma de hacer el down casting.
            Escritor escritor = (Escritor) empleado;
            escritor.getTipoEscritura();
            
            
            
            
            //upcasting convertir de clase hija a clase padre
            Empleado empledo2 = escritor;
            System.out.println(empledo2.obtenerDetalles());
            
    }
    
}
