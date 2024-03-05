import java.util.Scanner;

public class ejer14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();

        while (!entrada.equals("salir")) {
            if (entrada.length() == 0) {
                System.out.println("introduce datos");
            } else {
                String[] numerosString = entrada.split(",");
                int[] numeros = new int[numerosString.length];
                int suma = 0;

                try {
                    for (int i = 0; i < numerosString.length; i++) {
                        numeros[i] = Integer.parseInt(numerosString[i]);
                        suma += numeros[i];
                    }

                    int promedio = suma / numeros.length;
                    if (promedio == 0) {
                        System.out.println("Divide entre cero: " + promedio / 0);
                    } else {
                        System.out.println("Promedio: " + promedio);
                    }
                } catch (ArithmeticException e) {
                    System.out.println("División entre cero");
                }
            }
            entrada = scanner.nextLine();
        }

        scanner.close();
    }
}
