package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

//En esta clase se implementan las funcionabilidades de los metodos de la interface IAccesoDatos
public class AccesoDatosImpl implements IAccesoDatos {

    //Comprobamos si existe el archivo
    @Override
    public boolean existe(String nombreRecurso){
        //Creamos el objeto de tipo file y con el metodo exists() comprobamos si esta creado el archivo
        var archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    /*Se lee el archivo linea por linea y va creando un objeto por cada pelicula
      en la lista.*/
    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        //Creamos el objeto de tipo file y le pasamos el nombre del archivo
        var archivo = new File(nombreRecurso);
        //Creamos la lista de tipo Pelicula donde se va a listar lo que esta dentro del archivo
        List<Pelicula> peliculas = new ArrayList<>();
        //Try-Catch para capturar las excepciones y usar las creadas por nosotros.
        try {
            /*Creamos un objeto de la clase BufferedReader y le pasamos el nombre del archivo como
              parametro al objeto FileReader que va dentro del BufferedReader para leer el contenido 
              del archivo*/
            var entrada = new BufferedReader(new FileReader(archivo));
            //Variable que resivira el contenido de linea por linea
            String linea = null;
            //Metodo readLine() para leer una linea del archivo
            linea = entrada.readLine();
            //Con el ciclo se lee linea por linea haste que se encuentre con una linea vacia
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Error al listar pelicula: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Error al listar pelicula: " + ex.getMessage());
        }
        //Retorna la lista de tipo pelicula con el contenido del archivo
        return peliculas;
    }

    /*Aqui escribimos en el archivo pasamos como parametro nombre del archivo, 
      contenido que se va a escribir y con la variable booleana si ya hay contenido o no*/
    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        //Creamos el objeto de tipo file y le pasamos el nombre del archivo
        var archivo = new File(nombreRecurso);
        //Try-Catch para capturar las excepciones y usar las creadas por nosotros.
        try {
            /*Creamos un objeto de la clase PrintWriter y le pasamos el nombre del archivo y la variable 
              booleana como parametro al objeto FileWriter que va dentro del PrintWriter para 
              escribir en el contenido del archivo*/
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            //Metodo println() para escribir una linea en el archivo
            salida.println(pelicula.toString());
            //Metodo close() para Cerrar el archivo luego de escribir en el
            salida.close();
            System.out.println("Se escribio correctamente la pelicuala: " + pelicula);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Error al escribir la pelicula " + ex.getMessage());
        }
    }

    /*Buscamos la pelicula en el archivo para esto se pasa como parametro el nombre del archivo
      y del contenido que se va a buscar*/
    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        //Creamos el objeto de tipo file y le pasamos el nombre del archivo
        var archivo = new File(nombreRecurso);
        //Variable donde retornaremos el resultado
        String resultado = "";
        //Indice de posicionamiento del contenido buscado
        var indice = 1;
        //Try-Catch para capturar las excepciones y usar las creadas por nosotros.
        try {
            /*Creamos un objeto de la clase BufferedReader y le pasamos el nombre del archivo como
              parametro al objeto FileReader que va dentro del BufferedReader para leer el contenido 
              del archivo en este caso uno en especifico*/
            var entrada = new BufferedReader(new FileReader(archivo));
            //Variable que resivira el contenido de linea por linea
            String linea = null;
            //Metodo readLine() para leer una linea del archivo
            linea = entrada.readLine();
            /*En este caso se rompe el ciclo si esta la linea vacia o cuando encuentre lo que busca
              y se ejecuta el break que esta dentro del condicional*/
            while (linea != null) {
                /*La condicion es que la linea no sea nula y que concuerde con el 
                  contenido de la variable buscar*/
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    //Se almacena la informacion encontrada
                    resultado = " Pelicula " + linea + " encontrada en el indice " + indice;
                    //Se uas para romper el ciclo
                    break;
                }

                /*Si no se encontro lo buscado se ejecuta de nuevo el ciclo leyendo otra linea 
                  e incrementando el indice*/
                linea = entrada.readLine();
                indice++;

            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Error al buscar pelicula: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Error al buscar pelicula: " + ex.getMessage());
        }
        //Retorno del resultado encontrado
        return resultado;
    }

    //Aqui solo pasamos de parametro el nombre que tendra el archivo
    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        //Creamos el objeto de tipo file y le pasamos el nombre del archivo
        var archivo = new File(nombreRecurso);
        //Try-Catch para capturar las excepciones y usar las creadas por nosotros.
        try {
            /*Creamos un objeto de la clase PrintWriter y le pasamos el nombre del archivo y la variable 
              booleana como parametro al objeto FileWriter que va dentro del PrintWriter solo para 
              crear el archivo*/
            var salida = new PrintWriter(new FileWriter(archivo));
            //Creado el archivo podemos cerrarlo
            salida.close();
            System.out.println("Se ha creado el catalogo correctamente");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Error al crear el archivo " + ex.getMessage());
        }
    }

    //Aqui solo pasamos de parametro el nombre del archivo a eliminar
    @Override
    public void borrar(String nombreRecurso){
        //Creamos el objeto de tipo file y le pasamos el nombre del archivo
        var archivo = new File(nombreRecurso);
        //Comprobamos si existe el archivo
        if (archivo.exists()) {
            //De si existir se eliminara
            archivo.delete();
            System.out.println("Se ha borrado el archivo");
        }
        
    }

}
