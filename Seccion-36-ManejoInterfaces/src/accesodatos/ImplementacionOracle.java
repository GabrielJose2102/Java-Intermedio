package accesodatos;

/*Clase donde van a implementar los metodos de la interface aqui se le agrega el comportamiento a los metodos
    por eso esta clase no debe de ser asbtracta

  Se debe usar la palabra implements mas el nombre de la interface para traer los metodos de la interface 
    y poder darles su comportamiento*/
public class ImplementacionOracle implements IAccesoDatos{

    
    //Se le agrega el comportamiento a los metodos.
    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Oracle");
    }
    
    
    
}
