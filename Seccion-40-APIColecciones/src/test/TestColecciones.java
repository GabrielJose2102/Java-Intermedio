package test;

import java.util.*;

//En este ejercicio se pone en practica las 3 interface y sus clases conjuntos 
//Estas se usan para el almacenamientos de datos 
public class TestColecciones {
    public static void main(String[] args) {
        
        //Esta guarda los datos de forma de pila y su orden es de manera en que van siendo agregada 
        //se crea el objeto de tipo de la interface y apuntando a la clase donde se le dio comportamiento al metodo
        //En las colecciones de tipo Lista si puedee haber elementos duplicados. 
        List miLista = new ArrayList();
        //Asi se agregan los valores a la cola
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
//        imprimir(miLista);
            
        
        //Esta tambien guarada los datos pero su orden es aleatorio
        //se crea el objeto de tipo de la interface y apuntando a la clase donde se le dio comportamiento al metodo
        //En las colecciones de tipo Set No puede haber elementos duplicados.
        Set miSet = new HashSet();
        //Asi se agregan los valores a la cola
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
//        imprimir(miSet);
        
        //Esta a diferencia de las otras 2 se crea una llave que va relacionada con el valor que se va a guaradar
        //La llave es la que te da acceso para poder usar el valor.
        //se crea el objeto de tipo de la interface y apuntando a la clase donde se le dio comportamiento al metodo
        //En las colecciones de tipo Map el valor puede ser duplicado pero no las llaves la cual es la referencia a cada valor. 
        Map miMap = new HashMap();
        //Asi se agregan las llaves y los valores a la cola
        miMap.put("Llave1", "Gabriel");
        miMap.put("Llave2", "Jose");
        miMap.put("Llave3", "Torrealba");
        
//        String elemento = (String)miMap.get("Valor1");
//        System.out.println("elemento = " + elemento);
        
//        imprimir(miMap.keySet());
        imprimir(miMap.values());
    }

    
    //Metodo imprimir para usar el polimorfismo y asi acceder a los datos segun el objeto al que se hace referencia
    public static void imprimir(Collection coleccion){
        
        //Se usa el ciclo forEach de forma de funcion landa o funcion flecha como se conoce
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        
        //El metodo forEach de manera normal
//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }
        
        
    
}
