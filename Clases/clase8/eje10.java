import java.util.Scanner;

public class eje10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String numero = args[0];

        int num = Integer.parseInt(numero);

        while (true) {
            System.out.println("introduzca un numero mayor que " + num + " para terminar la ejecucion");
            int num2 = scanner.nextInt();

            if (num2 > num) {
                System.out.println("El numero " + num2 + " es mayor");
                break;
            }
        }

        scanner.close();
    }
}
