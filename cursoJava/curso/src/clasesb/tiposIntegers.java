public class tiposIntegers {

    public static void main(String[] args) {
        
        //byte, short, int, long
        byte bytevar = 15;
        System.out.println("bytevar = " + bytevar);

        short shortvar = 1000;
        System.out.println("shortvar = " + shortvar);
        System.out.println("valor minimo tipo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short: " + Short.MAX_VALUE);

        int intvar = 10000;

        System.out.println("intvar = " + intvar);
        System.out.println("valor minimo tipo int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int: " + Integer.MAX_VALUE);

        long longvar = 9223372036854775807L; //literales en java son de tipo entero y como nos excedemos del limite de int no podemos escribir le numero.  
        //añadimos la l para que se haga una literal de tipo long
        System.out.println("longvar = " + longvar);
        System.out.println("valor minimo tipo short: " + Long.MIN_VALUE);
        System.out.println("valor maximo tipo short: " + Long.MAX_VALUE);

        var numero = 2147483647; //var es de tipo entero por estandar. Pero con la L al final se vuelve de tipo long

        System.out.println(numero);
    }
}