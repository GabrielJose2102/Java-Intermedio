package test;

public class AutoboxingUnboxing {

    public static void main(String[] args) {
        //Clases Envolventes de tipos primitivos 
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
         */

        //Se hace mas fcil hacer cambio de tipo de dato
        Integer entero = 10;//Autoboxing
        System.out.println("entero = " + entero);
        System.out.println("entero double = " + entero.doubleValue());

        //Se hace mas facil hacer calculos
        int entero2 = entero;//Unboxing
        System.out.println("entero2 = " + entero2);

        Double doble = 10.3;
        System.out.println("double = " + doble);
        System.out.println("double = " + doble.intValue());

        Boolean caso = true;
        System.out.println("caso = " + caso);
        System.out.println("caso cadena = " + caso.toString());

        Long largo = 10000l;
        System.out.println("largo12121 = " + largo + largo);
        System.out.println("largo short = " + largo.shortValue());

        
        //Cambios de tipo de datos
        long largo2 = largo;
        System.out.println("largo222 = " + largo2 + largo2);
        System.out.println("largo2 = " + largo2);
        System.out.println("largo2 = " + Long.toString(largo2) + largo2);

        String cadena = String.valueOf(largo2);
        System.out.println("cadena = " + cadena + 2);
    }
}
