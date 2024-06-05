package test;

import accesodatos.*;

//Aqui se crean los objetos para instanciar a que clase va a apuntar y de que tipo es el objeto.
public class TestInterfaces {
    public static void main(String[] args) {
        
        //El objeto es de tipo IAccesoDatos pero apunta a la clase ImplementacionMySql
        //Es aqui donde usamos el polmorfismo 
        IAccesoDatos datos = new ImplemetacionMySql();
        //datos.listar();
        //imprimir(datos);
        
        //Aqui estamos cambiando la referencia al objeto al que apunta la variable.
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    
    //Creamos el metodo imprimir y recibe un argumento de tipo de la clase IAccesoDatos
    //ya que esta es la clase mas alta en gerarquia, es decir como la clase padre y asi podemos usar
    //objetos de las otras clases que estan implementando los metodos de la misma, es decir las clases hijas.
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
    
}
