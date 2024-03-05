public class eje4 {

    public static void main(String[] args) {
        
    String num1  = args[0];

    int base = Integer.parseInt(num1);

    if(base%2!=0){
      for(int i=0; i<=base; i++){
        for(int j=0; j<=i; j++){
          if(i%2==0){
          System.out.print("*");
          }
        }
        System.out.println(" ");
      }
    }
    else{
      System.out.println("Numero incorrecto");
    }
}
}