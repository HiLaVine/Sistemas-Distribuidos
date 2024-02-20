public class tiposChar {

    public static void main(String[] args) {
        
      
        System.out.println("Valor minimo de char = " + Character.MIN_VALUE);
        System.out.println("Valor maximo de char = " + Character.MAX_VALUE);

        char varchar = '\u0021'; //comillas simples si es solo un caracter, comilla doble si es una cadena. 
        // se agrega el slash inverso u para indicar que es un codigo unicode. 
        System.out.println("tiposChar = " + varchar);

        char varchard = 33;
        System.out.println("tiposChar = " + varchard);
    }
}