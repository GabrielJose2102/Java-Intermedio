package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        
        /*Creamos un objeto de la clase generica e indicamos de que tipo sera y añadimos 
            el o los atributos compatible con el tipo
        */
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Gabriel");
        objetoString.obtenerTipo();
    }
}
