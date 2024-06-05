package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

public class Test {
    public static void main(String[] args) {
        //Uso de elementos con modificador de acceso public
        Clase1 clase1 = new Clase1("");
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        

        //Uso de elementos con modificador de acceso protected
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
        
        //no se uso el modificador de acceso default o packege por no estar en el mismo paquete
        
        
        //Uso de elementos de modificador de  acceso private
        //Clase1 clase2 = new Clase1("constructor publico"); Llama primero al constructor privado vacio y despues al publico.
        
        clase1.setAtributoPrivate("Modificacion de atributo private");
        System.out.println("Atributo " + clase1.getAtributoPrivate());
        
    }
}
