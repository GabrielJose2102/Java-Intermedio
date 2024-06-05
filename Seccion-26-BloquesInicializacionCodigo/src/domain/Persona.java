package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //#1
    //Bloque estatico es el primero que se ejecuta y se ejecuta solo una vez al arrancar la clase
    static { //Solo variables estaticas
        System.out.println("Ejecucion de bloque estatico");
        contadorPersonas = ++Persona.contadorPersonas;
      //idPersona = 10;  no se puede por no er una variable static
    }
    
    //#2
    //Bloque dinamico se ejecuta por cada objeto de la clase que se cree
    {//Variables estaticas y no estaticas
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    //#3
    //Constructor vacio tambien se ejecuta por cada objeto de la clase que se cree
    public Persona(){//Variables estaticas y no estaticas
        System.out.println("Ejecucion del constructor");
    }

    //Metodo getter
    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona= " + idPersona + '}';
    }
    
    
}
