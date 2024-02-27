public class ejercicio3 {

    public static void main(String[] args) {
        
    String letra  = args[0];

    letra.toLowerCase();

    try{

        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("La letra  " + letra + " es vocal");
        
        }
        else {
            System.out.println("La letra  " + letra + " es no vocal");
      }
        
    }catch (NumberFormatException e) {
            System.err.println("Argumento invalido");
    
    }
    }
}

