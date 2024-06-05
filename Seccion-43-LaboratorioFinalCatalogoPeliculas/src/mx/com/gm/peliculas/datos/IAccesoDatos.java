package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

//Creacion de la interface
public interface IAccesoDatos {
   
                    //Creacion de metodos
    
    //Comprueba si existe el archivo
    boolean existe(String nombreRecurso) throws AccesoDatosEx;
    
    //Coloca en una lista los datos que estan dentro del archivo
    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;
    
    //Escribe dentro del archivo
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
    
    //Busca dentro del archivo
    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;
    
    //Crea el archivo
    void crear(String nombreRecurso) throws AccesoDatosEx;
    
    //Elimina el archivo
    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
