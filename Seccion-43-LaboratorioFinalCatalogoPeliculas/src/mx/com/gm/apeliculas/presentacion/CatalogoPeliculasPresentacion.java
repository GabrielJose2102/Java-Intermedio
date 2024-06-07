package mx.com.gm.apeliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        //Variable de la opcion que controla que se ejecuta del menu
        int opcion = -1;
        //Clase Scanner para resivir datos del teclado
        Scanner escanear = new Scanner(System.in);
        /*Variable tipo ICatalogoPeliculas y que apunta a la clase CatalogoPeliculasImpl 
          para poder usar los metodos de la clase CatalogoPeliculasImpl*/ 
        CatalogoPeliculasImpl catalogo = new CatalogoPeliculasImpl();
        
        //Se ejecuta este ciclo con el menu mientras la opcion no sea cero
        while (opcion != 0) {            
            System.out.println("Elige una Opcion: \n"
                    + "1. Iniciar Catalogo\n"
                    + "2. Agregar Pelicula\n"
                    + "3. Listar Peliculas\n"
                    + "4. Buscar Pelicula\n"
                    + "0. Salir\n");
            opcion = Integer.parseInt(escanear.nextLine());
            
            //Condiciobal con las opciones a ejecutar
            switch(opcion){
                
                case 1: //Iniciar o crear el catalago
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2://Agregapelicula al catalago se pide ingresar desde teclado el nombre de la pelicula
                    System.out.println("Nombre de la Pelicula: ");
                    String nombrePelicula = escanear.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3://Imprimimos la lista de las peliculas del catalago
                    catalogo.listarPelicula();
                    break;
                case 4://Buscar pelicula en el catalago se pide ingresar desde teclado el nombre de la pelicula
                    System.out.println("¿Cual pelicula buscas? ");
                    String buscar = escanear.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0://Salir del menu y finalizar el programa
                    System.out.println("Hasta Pronto");
                    break;
                default://Ninguna opcion valida
                    System.out.println("Opcion desconocida");
                    break;
            }
        }
    }
}
