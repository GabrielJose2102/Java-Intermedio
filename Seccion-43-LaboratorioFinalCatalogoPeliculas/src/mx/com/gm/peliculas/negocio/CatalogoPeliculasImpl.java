package mx.com.gm.peliculas.negocio;

import java.util.List;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

//En la clase se debe implementar la interface de ICatalogoPeliculas
public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    //Variable de tipo de la interface IAccesoDatos
    private final IAccesoDatos datos;

    //Constructor sin argumentos para inicializar la variable datos
    public CatalogoPeliculasImpl() {
        /*Esta variable apunta hacia la clase AccesoDatosImpl donde estan implementados 
          los metodos de la interface IAccesoDatos*/
        this.datos = new AccesoDatosImpl();
    }

    //Aqui agregaremos las peliculas al catalago pasamos de parametro el nombre de la pelicula
    @Override
    public void agregarPelicula(String nombrePelicula) {
        //Creamos el objeto de tipo pelicula y le pasamos el nombre de la pelicula que se va a agregar
        Pelicula pelicula = new Pelicula(nombrePelicula);
        //Creamos la variable booleana con el valor de false
        boolean anexar = false;

        //Capturamos el error que se propago desde el metodo existe el catalago
        try {
            //Aqui comprobamos si existe el catalago donde se va agregar la pelicula
            anexar = datos.existe(NOMBRE_RECURSO);
            /*Escribimos la pelicula en el catalago pasamos 3 parametros 
              nombre pelicula, nombre catalago y la variable booleana para saber si existe el catalago o no*/
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            //Se decidio mostrar el error aqui y no propagar mas, pero si se puede propagar al siguiente metodo 
            System.out.println("Error de Acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    
    //Mostramos la lista de peliculas en el catalago
    @Override
    public void listarPelicula() {
        //Capturamos la excepcion propagada que viene del metodo
        try {
            //insertamos el contenido dentro de la lista
            List<Pelicula> peliculas = this.datos.listar(NOMBRE_RECURSO);
            //Con un ForEach imprimimos todo el contenido de esa lista
            for(Pelicula pelicula: peliculas){
                System.out.println("pelicula = " + pelicula);
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al listar los datos");
            ex.printStackTrace(System.out);
        }
    }

    
    //Buscamo una pelicula en especifico
    @Override
    public void buscarPelicula(String buscar) {
        //Varible donde se va a almacenar el resultado
        String resultado = null;
        //Capturamos la excepcion propagada que viene del metodo
        try {
            /*Ejecutamos el metodo buscar de la clase AccesoDatosImpl y pasmos de parametros
              el nombre del catalago y el nomber de la pelicula a buscar*/
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al buscar pelicula en el archivo");
            ex.printStackTrace(System.out);
        }
        //Mostramos el resultado en pantalla
        System.out.println(" resultado = " + resultado);
    }

    //Creamos el catalago
    @Override
    public void iniciarCatalogoPeliculas() {
        //Capturamos la excepcion propagada que viene del metodo
        try {
            //Se comprueba si existe el catalago si existe se borra y se crea otra vez
            if (this.datos.existe(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else{
                //Si no existe solo se crea
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de peliculas: ");
            ex.printStackTrace(System.out);
        }
    }

}
