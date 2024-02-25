/* 
24 Leer un archivo de texto que contiene un número entero por cada línea e indicar cuál es el
número mayor dentro del archivo y el número de renglón en que se encuentra.
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class proyecto1 {
    public static void main(String[] args) {
        File archivo = new File("numeros.txt");

        int numeroMayor = Integer.MIN_VALUE; 
        int numeroRenglon = -1;
        int renglonActual = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                renglonActual++;

                
                int numero = Integer.parseInt(linea);

                
                if (numero > numeroMayor) {
                    numeroMayor = numero;
                    numeroRenglon = renglonActual;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("El archivo contiene datos no numéricos.");
        }

        if (numeroRenglon != -1) {
            System.out.println("El número mayor es " + numeroMayor + " y se encuentra en el renglón " + numeroRenglon + ".");
        } else {
            System.out.println("El archivo está vacío o no contiene números.");
        }
    }
}