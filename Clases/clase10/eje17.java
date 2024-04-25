import java.util.Scanner;

public class ejer17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String entrada = "";

        while (!entrada.equals("salir")) {
            entrada = scanner.nextLine();

            try {
                if (entrada.length() == 0) {
                    throw new ArregloVacioException("El arreglo está vacío");
                }

                String[] numerosString = entrada.split(",");
                int[] numeros = new int[numerosString.length];
                int suma = 0;

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

            } catch (ArregloVacioException e) {
                System.out.println("El arreglo está vacío");
            } catch (ArithmeticException e) {
                System.out.println("División entre cero");
            }
        }
        scanner.close();
    }
}

class ArregloVacioException extends Exception {
    public ArregloVacioException(String s) {
        super(s);
    }
}