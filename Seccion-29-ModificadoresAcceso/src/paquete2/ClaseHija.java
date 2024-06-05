package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1{
    
    public ClaseHija(){
        super();
        this.atributoProtected = "modificacion variable protected";
        System.out.println("Atributo protegido = " + this.atributoProtected);
        this.metodoProtecte();
    }
    
}
