package paquete1;

//Modificador de acceso public si esta permitido para clases 
//Modificador de accso protected no permitido para clases
//Modificador de acceso default si esta permitido pero no se podra usar esta clase en otro paquete
//Modificador de acceso private no permitido para clases


        /*Public*/

//Permitido acceso desde (misma clase, mismo paquete, subclase, todos los demas)
public class Clase1 {
    
    public String atributoPublico = "variable publico";
    
    public Clase1(String arg){
        System.out.println("Constructor publico");
    }
    
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
    
    
    
    
        /*Protected*/
    
    //No se usa para clases
    
    
    //Parte 2 uso del modificador de acceso protecte
    /*Los elementos con el identificador protected solo se puede acceder a ellos
         mediante la herencia pero los constructores no se pueden heredar.
    */
    
    //Permitido acceso desde (misma clase, mismo paquete, subclase)
    //Perimitido para todos los demas solo si se hereda esta clase con extends
    protected String atributoProtected = "variable protectedd";
    
    protected Clase1(){
        System.out.println("Constructor protected");
    }
    
    protected void metodoProtecte(){
        System.out.println("Metodo protected");
    }
    
    
    
    
            /*Default o packages*/
    
    //Parte 3 uso del modificador de acceso default o packages
    /*Los elementos con este modificador de acceso solo pueden
        ser usados por clases dentro del mismo paquete y usando la herencia
    con la palabra extens.
    */
    
    //Atributos, constructores y metodos con el modificador de acceso default
    
    //Permitido acceso desde (misma clase, mismo paquete)
    //No Permitido acceso desde ( subclase, todos los demas)
     String atributoDefault = "variable Default";
    
//     Clase1(){
//        System.out.println("Constructor default");
//    }
//    
//     void metodoDefault(){
//        System.out.println("Metodo default");
//    }
    
    
     
               /*Private*/
     
    //Parte 4 uso del modificador de acceso private
     
    //Permitido acceso desde (misma clase)
     //Permitido acceso desde (mismo paquete, subclase, todos los demas)
    private String atributoPrivate = "variable private";
    
//    private Clase1(){
//        System.out.println("Constructor private");
//    }
    
    public void metodoPrivate(){
        System.out.println("Metodo private");
    }
    
    // Metodos para accseder al atributo privado
    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
}
