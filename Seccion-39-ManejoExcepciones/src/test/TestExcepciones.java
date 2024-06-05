package test;

//Manejo de Excepciones 

import static aritmetica.Aritmetica.division;


public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        
        //Ejemplo de Exception
        //Son excepciones que se esta seguro que pueden aparecer en el programa 
        
        //Dentro del try se llama al metodo de la excepcion
        try {
            resultado = division(10, 0);
            
         //Dentro del catch el o los mensaje que se imprimen en pantalla de parte de la excepcion
         //Depende de la cantidad de informacion que deseemos dar al usuario
        } catch (Exception e) {
            System.out.println("Ocurrio un Error");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        //Fuera de la sentencia try/catch el resultado de la operacion 
        System.out.println("resultado = " + resultado);
    }
}
