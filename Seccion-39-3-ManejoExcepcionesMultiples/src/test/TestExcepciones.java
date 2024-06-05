package test;

//Manejo de Excepciones 

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;


public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        
        //Ejemplo de Exception
        //Son excepciones que se esta seguro que pueden aparecer en el programa 
        
        //Dentro del try se llama al metodo de la excepcion
        try {
            resultado = division(10, 0);
            
         
        //Se pueden tener multiples excepciones pero se colocan por orden de jerarquia 
        //Se colocan de menos genericas a mas genericas, es decir primero las clases hijas que las clases padres.
        }catch(OperacionExcepcion e){
            
            System.out.println("Ocurrio un Error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());    
            
            
        //Dentro del catch el o los mensaje que se imprimen en pantalla de parte de la excepcion
        //Depende de la cantidad de informacion que deseemos dar al usuario
        } catch (Exception e) {
            System.out.println("Ocurrio un Error");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        
        //El bloque de finally se ejecutara independiente de que haya una excepcion o no.
        //Tambien independiente de que tipo de excepcion sea.
        finally{
            System.out.println("Se reviso la division entre cero");
        }
        //Fuera de la sentencia try/catch el resultado de la operacion 
        System.out.println("resultado = " + resultado);
    }
}
