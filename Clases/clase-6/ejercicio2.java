public class ejercicio2 {

    public static void main(String[] args) {
        
    String numero  = args[0];

    int num = Integer.parseInt(numero);

      if(num <= 0){
        System.out.println("El numero " + num + " es negativo");
      }
      else if( num == 0){
        System.out.println("El numero es 0");
      }
      else {
        System.out.println("El numero " + num + " es positivo");
      }
        
    }
}

