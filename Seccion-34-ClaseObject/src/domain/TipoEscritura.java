package domain;

public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descricion){
        this.descripcion = descricion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
}
