package domain;

public class Empleado {

    protected String nombre;
    protected double sueldo;

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //Metodo de la clae hija al cual se le realizara la sobreescritura
    public String ordenarDetalles() {
        return "nombre: " + this.nombre + ", sueldo:" + this.sueldo;
    }

    public double pagarSueldo(double sueldo) {
        return sueldo * 40;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
