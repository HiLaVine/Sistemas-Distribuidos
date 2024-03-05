public class e13 {

    public static void main(String[] args) {

        if (args.length != 9) {
            System.out.println("Cantidad de numeros incorrectos");
            return;
        }

        int[][] matriz = new int[3][3];

        int contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(args[contador]);
                contador++;
            }
        }

        System.out.println("La matriz resultante es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matriz4 = new int[4][4];
        for (int j = 0; j < 3; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 3; i++) {
                sumaColumna += matriz[i][j];
            }
            matriz4[3][j] = sumaColumna;
        }

        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
            }
            matriz4[i][3] = sumaFila;
        }

        /*
         * for (int i = 0; i < 3; i++) {
         * int sumaFila = 0;
         * sumaFila += matriz4[3][i];
         * matriz4[3][3] = sumaFila;
         * }
         */

        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz4[i][j] + "   ");
            }
            System.out.println();
        }
    }
}