public class eje16 {
    public static void main(String[] args) {
        int[] arr = new int[4];

        try {
            int i = arr[2];
            System.out.println("Estoy dentro de try");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Detalles de la excepción: " + e.getMessage());
        }
        System.out.println("Continúa ejecutándose el resto del programa ...");
    }
}

/*
 * 1.
 * 
 * Con ArithmeticException e el programa compila y se ejecuta incorrectamente,
 * ya
 * que el tipo de excepción que se
 * está tratando de capturar no coincide con el tipo de excepción que se está
 * generando. Ya que esta excepción se genera cuando se intenta dividir por
 * cero.
 * 
 * Con ArrayIndexOutOfBoundsException e el programa compila y se ejecuta
 * correctamente, ya que el tipo de excepción que se está tratando de capturar
 * coincide con el tipo de excepción que se está generando. Ya que esta
 * excepción se usa cuando se intenta acceder a un índice de un arreglo que no
 * existe.
 * 
 * 2.
 * Como el arreglo tiene una longitude de 4, al acceder a la posicion 10 esta no
 * existe y salta el catch, pero al acceder a la posicion que si esta dentro del
 * arreglo se imprime el mensaje
 * "Estoy dentro de try" y luego se imprime el mensaje
 * "Continúa ejecutándose el resto del programa ..." sin error alguno.
 */