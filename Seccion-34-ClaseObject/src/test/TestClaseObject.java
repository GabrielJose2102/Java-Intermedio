package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
         //Creacion de los objetos par comparar
        Empleado empleado1 = new Empleado("Juan", 65000);
        Empleado empleado2 = new Empleado("Juan", 65000);
        
        
        //Comparacion de referencias a la que apuntan
        if(empleado1 == empleado2){
            System.out.println("tienen la misma referencia en memoria");
        }else{
            System.out.println("tienen distintas referencia en memoria");
        }
        
        //Comparacion de el contenido de los objetos metodo equals
        if(empleado1.equals(empleado2)){
            System.out.println("El contenido es igual");
        }else{
            System.out.println("El contenido es distinto");
        }
        
        //Comparacion de el contenido de los objetos metodo HashCode
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("EL hashcode es igual");
        }else{
            System.out.println("El hashcode es distito");
        }
        
    }
    
}
