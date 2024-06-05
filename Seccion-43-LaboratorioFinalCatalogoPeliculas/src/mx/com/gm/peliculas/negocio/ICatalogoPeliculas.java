package mx.com.gm.peliculas.negocio;

//Creacion de la interface
public interface ICatalogoPeliculas {
                    
                    //Creacion de metodos
    
    //Nombre que se le otorgara al archivo
    String NOMBRE_RECURSO = "Peliculas.txt";
    
    //Aqui agregaremos las peliculas al catalago
    void agregarPelicula(String nombrePelicula);
    
    //Es para listas las peliculas que se encuentran en el catalago
    void listarPelicula();
    
    //Es para buscar una pelicula en especial dentro del catalago
    void buscarPelicula(String buscar);
    
    //Aqui creamos el catalago
    void iniciarCatalogoPeliculas();
}
