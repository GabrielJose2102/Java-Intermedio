package domain;

public class Gerente extends Empleado {
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    /*Metodo sobreescrito de la clase hija no puede ser mas restrictivo el operador de acceso
       debe ser igual o menos restrictivo
    */
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento:" + this.departamento;
    }
    
}
