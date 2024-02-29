public class tiposBoolean {

    public static void main(String[] args) {
        
        //boolean

        System.out.println("true tipo boolean = " + Boolean.TRUE);
        System.out.println("false tipo boolean = " + Boolean.FALSE);

        boolean bovar = false;

        if(bovar){
            System.out.println("el valor es verdadero");
        }
        else{
            System.out.println("Es falso");
        }

        int edad = 19;
        boolean esAdulto = edad >= 18; //funcion?? 

        System.out.println(esAdulto);

    }
}