public class eje1 {

    public static void main(String[] args) {
        
    String numero  = args[0];

    int num = Integer.parseInt(numero);

    
      if(num % 2 == 0){
        System.out.println("El numero " + num + " es par");
      }
      else
      {
        System.out.println("El numero " + num + " es impar");
      }
        
    }
}

