package genericos;

/*Declaramos la clase y dentro del operador diamante colocamos la letra que identificara que tipo de clase
    generica sera
*/  

//En este clase la "T" significa que es de tipo de un objeto
public class ClaseGenerica <T> {
    
    //Declaramos un atributo del tipo de la letra que esta dentro del operador diamante
    private T objeto;
    
    /*Igual lo hacemos con el constructor el cual el atributo sera del tipo que se especifique
        al momento de instaciar la clase
    */
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    //Un metodo para mostrar el tipo del objeto al ser instanciada la clase
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
