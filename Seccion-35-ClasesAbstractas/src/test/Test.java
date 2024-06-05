package test;

import domain.*;

public class Test {
    public static void main(String[] args) {
        
        //Como la clase padre es abstracta no se puede crear objetos de ella por eso usamos a la clase hija
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        
        FiguraGeometrica figura = new Rectangulo("Rectagulo");
        figura.dibujar();
    }
    
}
