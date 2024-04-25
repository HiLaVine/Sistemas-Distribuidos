import java.util.Random;

public class PruebaRectangulo {
   public static void main (String[] args) {
      int n = Integer.parseInt(args[0]);
      
      Coordenada[] coordenadas = new Coordenada[2*n];
      Random random = new Random();
      for (int i = 0; i < 2*n; i++) {
         int x = random.nextInt(1001);
         int y = random.nextInt(1001);
         coordenadas[i] = new Coordenada(x, y);
      }
      
      Rectangulo[] rectangulos = new Rectangulo[n];
      for (int i = 0; i < n; i++) {
         rectangulos[i] = new Rectangulo(coordenadas[2*i], coordenadas[2*i+1]);
      }
      for (Rectangulo rectangulo : rectangulos) {
         System.out.println(rectangulo);
      }
   }
}