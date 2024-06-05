package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        
        //Todos los parametros de tipo int van dirigido al argumento de tipo variable
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1,2);
        variosParametros("Juan", 1, 2, 3, 4);
        
    }
    
    /*El argumento variable debe ir colocado de ultimo en la declaracion de parametros*/
    private static void variosParametros(String nombre, int... numeros){
            System.out.println("nombre = " + nombre);
            imprimirNumeros(numeros);
    }
    
    /*Se detecta el argumento con los 3 puntos como un arreglo y al momento de 
        llamarlo se le puede pasar mas de un parametro en una misma llamada*/
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento " + numeros[i]);
        }
    }

}
