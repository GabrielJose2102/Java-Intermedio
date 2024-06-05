package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        //Arreglo de tipo int 
        int edades[] = {5, 6, 8, 9};
        
        //ForEach de tipo int recorrea todos los puestos del arreglo y los guarda en la variable edad creada
        for(int edad : edades){
            System.out.println("edad = " + edad); 
        }
        
        //Arreglo de tipo Objeto 
        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};
        
        //ForEach de tipo objeto recorrea todos los puestos del arreglo y los guarda en la variable edad creada
        for(Persona persona: personas){
            //Imprime cada objeto del arreglo 
            System.out.println("persona = " + persona);
            
            //Imprime cada objeto del arreglo pero usando el metodo getter
            System.out.println("persona = " + persona.getNombre());
        }
    }
}
