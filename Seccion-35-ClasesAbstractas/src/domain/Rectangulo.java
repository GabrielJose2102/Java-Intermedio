package domain;

//Clase hija Rectangulo
public class Rectangulo extends FiguraGeometrica{
    
    //Constructor de la clase que recibe argumento de la clase padre
    public Rectangulo(String tipoFigura){
        //Uso de la palabra super para poder usar la variable tipoFigura que viene de la clase padre
        super(tipoFigura);
    }
    
    //Metodo dibujar aqui no es abstracto para que se pueda ejecutar en la clase principal
    /*Se le esta dando el comportamiento que se ejecutara y sale como si se estubiera sobrescribiendo
        pero no porque en la clase padre no tiene comportamiento.
    */ 
    
    @Override
    public void dibujar(){
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}
