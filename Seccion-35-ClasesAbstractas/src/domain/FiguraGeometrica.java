package domain;

//Clase padre abstracta 
public abstract class FiguraGeometrica {
    
    //Variable donde se recibira el tipo de figura que se imprimira
    protected String tipoFigura;
    
    //Construtor de la clase para inicializar la varible
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    //metodo abstracto por eso no tiene comportamiento
    public abstract void dibujar();
    
    
    //metodos setter y getter para vatiable tipoFigura
    public String getTipoFigura(){
        return tipoFigura;
    }
    
    public void setTipoFigura(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
}
