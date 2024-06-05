package test;

import manejoarchivos.ManejoArchivos;
import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {

    public static void main(String[] args) {
         String nombreArchivo = "Prueba.txt";
         ManejoArchivos.crearArchivo(nombreArchivo);

            escribirArchivo(nombreArchivo, "Hola desde Java");

//          anexarArchivo(nombreArchivo, "Anexando desde Java");
//          anexarArchivo(nombreArchivo, "Adios");

            leerArchivo(nombreArchivo);
    }
}
