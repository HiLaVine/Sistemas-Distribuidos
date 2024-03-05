public class eje12 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No se introdujeron datos");
        }

        int[] numeros = new int[args.length];
        int[] numeros2 = new int[args.length];

        int largo = args.length;
        int suma = 0;

        for (int i = 0; i < largo; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma total es: " + suma);

        for (int i = 0; i < numeros.length; i++) {
            numeros2[i] = numeros[i] * 2;
            System.out.println(numeros2[i]);
        }
        int mayor = numeros2[0];
        int menor = numeros2[0];

        for (int i = 0; i < numeros2.length; i++) {
            if (mayor <= numeros2[i]) {
                mayor = numeros2[i];
            }
        }

        for (int i = 0; i < numeros2.length; i++) {
            if (menor >= numeros2[i]) {
                menor = numeros2[i];
            }
        }

        System.out.println("Mayor = " + mayor);
        System.out.println("Menor = " + menor);
    }
}