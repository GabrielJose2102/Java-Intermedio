package mx.com.gm.peliculas.excepciones;

//La clase debe de extender de la clase exception 
public class AccesoDatosEx extends Exception {

    //Dentro del constructor se llama al constructor de la clase padre
    public AccesoDatosEx(String mensaje) {
        super(mensaje);
    }
}
