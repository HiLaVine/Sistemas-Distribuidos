import java.util.Scanner;
public class convercionTipos {

    public static void main(String[] args) {

        //converitr un string a un tipo int

        var edad = Integer.parseInt("20");

        System.out.println("edad = " + edad);

        double pi = Double.parseDouble("3.1416");

        System.out.println("pi = " + pi);

        char c = "hola".charAt(0); //imprime un caracter del string compelto

        System.out.println("c = "+ c);

        var scanner = new Scanner(System.in);
        edad  = Integer.parseInt(scanner.nextLine());
        System.out.println("edad = " + edad);

        char caracter = scanner.nextLine().charAt(0);

        System.out.println("caractar = "+ caracter);

        String edadt = String.valueOf(false); //con value of transformamos todo a string
        System.out.println(edadt);

        short a = 10; //Casting de un tipo primitivo a otro. 
        byte b = (byte) a;

        System.out.println("tipo short = " + a + "\ntipo byte = " + b);
    }

}