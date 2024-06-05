package accesodatos;

//Clase donde van a implementar los metodos de la interface como si se conectara con una base de datos de MySql
public class ImplemetacionMySql implements IAccesoDatos{

    //Aqui se le agrega cpmportamiento a todos los metodos de la interface
    //Es parecido a sobrescribir un metodo pero solo se le esta agregando el comportamiento que no tenia.
    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySql");
    }
    
    
    
}
