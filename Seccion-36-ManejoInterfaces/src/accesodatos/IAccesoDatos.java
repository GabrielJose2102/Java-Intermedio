package accesodatos;

//Creaccion de interface 
public interface IAccesoDatos {
    
    //Argumento es una constante es final y estatica
    int MAX_REGISTRO = 10;
    
    //Metodos todos son de tipo public y abstrac por defecto y por eso no se les agrega comportamiento
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
