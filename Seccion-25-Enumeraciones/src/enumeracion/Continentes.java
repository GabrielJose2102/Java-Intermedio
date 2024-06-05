package enumeracion;

//Enumeracion con atributos
public enum Continentes {
    AFRICA(53, "1.2 billones"),
    EUROPA(46, "1.9 billones"),
    ASIA(44, "3 billones"),
    AMERICA(34, "1.5 billones"),
    OCEANIA(14, "0.4 billones");
    
    //Receptores de los atributos
    private final int paises;
    private final String habitantes;
    
    //Coanstructor para inicializar los atributos de cada constante
      Continentes(int paises, String habitantes){
          this.paises = paises;
          this.habitantes = habitantes;
      }
      
      
      //Metodos getter para llamar el valor de cada atributo de las constantes
      public int getPaises(){
          return this.paises;
      }
      
      public String getHabitantes() {
          return this.habitantes;
      }
}
