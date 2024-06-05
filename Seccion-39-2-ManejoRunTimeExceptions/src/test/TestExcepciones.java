package test;

//Manejo de Excepciones 

import static aritmetica.Aritmetica.division;


public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        
        //Ejemplo de RuntimeException
        //Son excepciones que salen a relucir solo cuando se esta ejecutnado el programa
        
        //El try/catch es opcional en este tipo de excepciones
        //Sigue estando la excepcion con menos codigo, solo que no se muestra tanta informacion
        //Tambien que ael progama terminara de forma abructa sin finalizar todo el codigo solo hasta donde esta la excepcion
            resultado = division(10, 0);
        System.out.println("resultado = " + resultado);
    }
}
