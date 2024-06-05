package domain;

//Se debe importar esta libreria
import java.io.Serializable;


//Se debe implementar Serializable para que la calse al ser usada por framework o en la web pueda ser convertida a 0 y 1
public class Persona implements Serializable {

    
    //Todos los atributos deben de ser privados
    private String nombre;
    private String apellido;

    
    //Es obligatorio crear un constructor vaio
    public Persona() {

    }

    
    
    //El constructor con argumentos es opcional
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    

    //Cada atributo debe de tener su metodo setter y getter es obligatorio
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
