package aritmetica;

import excepciones.OperacionExcepcion;

//Aqui creamos la clase donde se realizara el proceso de la excepcion 
//Tambien donde saldra el mensaje que dara la excepcion
public class Aritmetica {
    
    //Se crea un metodo static para evitar la creacion de un objeto previo, es decir no se crea constructor para inicializar los argimentos
    
    //El metodo debe no es obligatorio que lleve la firma de la clase hija de la clase RuntimeException para que funcione
    public static int division(int numerador, int denominador){
        
        //Comportamiento del metodo 
        if(denominador == 0){
            //Aqui es donde se manda a lanzar el mensaje de la excepcion
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador / denominador; 
    }
}
