import java.net.Socket;
import java.util.Scanner;

public class sentenciaSwitch {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String mes = scanner.nextLine().toLowerCase();

        String estacion = null;

        switch (mes) {
            case "enero":
            case "febrero":
            case "diciembre":
                    estacion = "Invierno";
                break;
            case "marzo":
            case "abril":
            case "mayo":
                    estacion = "Primavera";
                break;
            case "junio":
            case "julio":
            case "agosto":
                    estacion = "Verano";
                break;
            case "septiembre":
            case "octubre":
            case "noviembre":
                    estacion = "Otoño";
                break;
        
            default: 
                System.out.println("Introduce un mes valido");
                break;
        }

        System.out.println(mes + " esta en la estacion: " + estacion);

        scanner.close();
    }
}