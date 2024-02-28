import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // creacion de objetos

        String mes = scanner.nextLine().toLowerCase();

        String estacion = null;

        if(mes.equals("diciembre") || mes.equals("enero") || mes.equals("febrero")){
            estacion = "invierno";
        }
        else if (mes.equals("marzo") || mes.equals("abril") || mes.equals("mayo")|| mes.equals("junio") ) {
            estacion = "Primavera";
        }
        else if (mes.equals("agosto") || mes.equals("septiembre")|| mes.equals("julio")) {
            estacion = "Verano";
        }
        else if (mes.equals("octubre") || mes.equals("noviembre")) {
            estacion = "Otoño";
        }
        else
            System.out.println("Introduce un mes valido");

        System.out.println(mes + " esta en la estacion:  " + estacion);

        scanner.close();
    }
}