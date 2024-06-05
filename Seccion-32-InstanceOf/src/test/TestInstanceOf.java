package test;

import domain.*;

    //Aplicacion de palabra instanceof

public class TestInstanceOf {
    public static void main(String[] args) {
        
        //creacion de objetos instanciado con la clase Empleado
        Empleado empleado = new Empleado("Juan", 10000);
        //determinarTipo(empleado);
        
        //creacion de objetos instanciado con la clase Gerente
        empleado = new Gerente("Gabriel", 6000, "Sistemas");
        determinarTipo(empleado);
    }
    
    //Metodo para determinar a que tipo de objeto esta señalando
    public static void determinarTipo(Empleado empleado){
        
        //Condicionales para hacer pregunta con instanceof para saber que tipo es.
        
        
        /*Si el objeto instanciado tiene su referencia apuntado a la clase Gerente dara de resultado true
            y tambien su clase padre y las clases padre que esten por encima de estas
        */
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            
            //conversion de la variable que apunta al objeto padre para que apunte al objeto hijo
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.ordenarDetalles());
            //((Gerente) empleado).getDepartamento();     
        }
        
        /*Si el objeto instanciado tiene su referencia apuntado a la clase Empleado dara de resultado true
            y tambien su clase padre y las clases padre que esten por encima de estas
        */
        
        if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            System.out.println("empleado = " + empleado.ordenarDetalles());
            System.out.println("empleado = " + empleado.getNombre());
        }
       
        
        //El resultado es true por que el objeto esta apuntando hacia la clase hija de sesta misma clase
        if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
    }
}
