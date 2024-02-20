import java.util.Scanner;

public class proyecto1{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        double radio = scanner.nextDouble();
        double altura = scanner.nextDouble();


        double volumne_cono = radio * altura;

        System.out.println("altura = " + altura);
        System.out.println("radio = " + radio);
        System.out.println("multi = %.4", volumne_cono);



    }

}