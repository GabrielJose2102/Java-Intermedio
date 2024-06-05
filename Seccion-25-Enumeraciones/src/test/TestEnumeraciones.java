package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {

        //Primera parte de la clase.
        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.LUNES);

        
        //Uso de la enumeracion con atributos nombre de la constante mas su metodo getter
        System.out.println("Continente No.1: " + Continentes.AMERICA);
        System.out.println("No. de paise en el continente No.4: " + Continentes.AMERICA.getPaises());
        System.out.println("No. de paise en el continente No.4: " + Continentes.AMERICA.getHabitantes());

    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana: " + Dias.LUNES);
                break;

            case MARTES:
                System.out.println("segundo dia de la semana: " + Dias.DOMINGO);
                break;
            default:
                System.out.println("No has selecionado dia");
        }
    }
}
