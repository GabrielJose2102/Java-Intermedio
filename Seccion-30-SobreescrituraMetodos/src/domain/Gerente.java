package domain;

public class Gerente extends Empleado{
      
    //nuevo argumento que se agregara al metodo sobreescrito
    private String departamento;
    
    public Gerente(double sueldo) {
        super(sueldo);
    }
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    
    //Sobreescritura del metodo 
    //Override identificador de que se hara una sobreescritura
    
    @Override
    public String ordenarDetalles(){
        //Palabra super para llamar las instrucciones del metodo en la clase padre
        return super.ordenarDetalles() + ", Departamento: " + this.departamento;
    }
    
    @Override
    public double pagarSueldo(double sueldo) {
        return sueldo * 80;
    }
}
