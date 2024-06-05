package mx.com.gm.peliculas.domain;

//Esta es la clase donde se crea el objeto pelicula
public class Pelicula {

    //Variable del nombre de la pelicula
    private String nombre;

    //Constructor vacio
    public Pelicula() {
    }

    //Constructor que referencia al objeto pelicula
    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    //Metodos setter y getter
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
