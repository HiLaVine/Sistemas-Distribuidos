public class ejercicio4 {

    public static void main(String[] args) {
        
    String numero  = args[0];

    int num = Integer.parseInt(numero);
    int resultado=0;

    for (int i = 1; i <= num; i++){
      
      if(i % 2 == 0){
        resultado +=i;
      }
    }
    

    System.out.println("La suma es:  " + resultado);
    }
}

