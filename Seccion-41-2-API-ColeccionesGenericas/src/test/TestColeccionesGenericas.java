package test;

import java.util.*;

 
public class TestColeccionesGenericas {
    public static void main(String[] args) {
        
     //Se indica el tipo de dato que se manejara en la lista
        List<String> miLista = new ArrayList<>();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        
        //Aqui indicamos a que dato de la lista queremos acceder
//        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);
//        imprimir(miLista);
            
        
       //Se indica el tipo de dato que se manejara en la lista
        Set<String> miSet = new HashSet<>();
        
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miLista.add("Viernes");
        
//        imprimir(miSet);
        
        /*Se indica el tipo de dato que se manejara en la lista puede ser de 2 dso tipos diferente una para
            la llave y otro para el valor*/
        Map<String, String> miMap = new HashMap<>();
       
        miMap.put("Valor1", "Gabriel");
        miMap.put("Valor2", "Jose");
        miMap.put("Valor3", "Torrealba");
        
        String elementoMap = (String)miMap.get("Valor1");
//        System.out.println("elementoMap = " + elementoMap);
        
        imprimir(miMap.keySet());
        imprimir(miMap.values());
    }

    
    //Metodo imprimir para usar el polimorfismo y asi acceder a los datos segun el objeto al que se hace referencia
    //Aqui tambien se indica de que tipo sera el objeto que usaremos 
    public static void imprimir(Collection<String> coleccion){
        
        //Se usa el ciclo forEach de forma landa o flecha como se conoce
        //Ahora la variable elemento es de tipo String
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        
        //El metodo forEach de manera normal
//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }
        
        
    
}
