import java.math.BigInteger;

public class CountDigits {
    public static void main(String[] args) {
        // Número para contar las cifras
        BigInteger number = new BigInteger("1478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321478956321478956321478956321478956321478956321478956321478963214789563214789632147859632147856321478956321");

        // Contador de cifras
        int count = countDigits(number);

        // Mostrar el resultado
        System.out.println("El número " + number + " tiene " + count + " cifras.");
    }

    // Función para contar las cifras de un número BigInteger
    public static int countDigits(BigInteger number) {
        // Convertir el número a una cadena de texto
        String numberString = number.toString();

        // Contar la longitud de la cadena
        return numberString.length();
    }
}
