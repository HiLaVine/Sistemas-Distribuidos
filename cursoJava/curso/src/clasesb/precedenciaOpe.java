public class precedenciaOpe {

    public static void main(String[] args) {
        
        var x =5;
        var y = 10;
        /*  preincremento x =6 
        post decremento(se decrementa hasta la siguiente vez que se use) 
        y = 10;
        */

        var z = ++x + y--; 


        System.out.println(z);
        System.out.println(x);
        System.out.println(y);//se usa despues, y ahora si vale 9

        System.out.println("\n");

        var resultado = 4+5*6/3;
        System.out.println(resultado);
    }
}