package excepciones;

//Crear nuestras propias clases de excepciones
//Se crea una clase hija que hereda de la clase Exception 
public class OperacionExcepcion extends Exception{
    
    //se crea un constructor para manadar a llamar el constructor de la clase padre con su argumento
    public OperacionExcepcion(String mensaje){
        //Con la palabra super se llama el argumento donde se guardara el mensaje que dejara la excepcion
        super(mensaje);
    }
    
}
