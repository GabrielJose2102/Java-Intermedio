package domain;

public class Gerente extends Empleado{
      
    //nuevo argumento que se agregara al metodo sobreescrito
    private String departamento;
    
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
