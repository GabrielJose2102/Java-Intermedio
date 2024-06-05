package manejoarchivos;

import java.io.*;

public class ManejoArchivos {

    //Se crea el archivo, creando un objeto de la clase File y se le pasa un nombre como parametro
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        //Es necesario encerrarlo en un try-catch y declarar la excepcion en la firma del metodo
        try {
            //Creamos un objeto de la clase PrintWriter y se le pasa el archivo creado como parametro
            PrintWriter salida = new PrintWriter(archivo);
            //Cerramos el archivo creado con el metodo close()
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    //En este metodo pasamos 2 parametros el nombre del archivo y el contenido que introduciremos
    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            //El metodo println se usa para escribir una linea dentro del archivo
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    //Metodo para anexar mas contenido al archivo
    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        //Se debe agregar otro catch para la excepcion que puede dar la clase FileWriter
        try {
            //Se usa la clase FileWriter y se pasa los 2 parametro nombre del archivo y contenido a anexar
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado informacion al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }


    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        //Se debe agregar un catch adicional para la excepcion de del metodo readLine()
        try {
            /*Usamos BufferedReader para leer el archivo y con la clase FileReader le indicamos 
            que el archivo qu vamos a leer*/
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            //Usamos el metodo readLine() para leer lineas
            String lectura = entrada.readLine();
            //En el ciclo ejecutamos el metodo readLine() hasta que se encuentre con una linea vacia
            while (lectura != null) {
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
