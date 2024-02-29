public class operadores {

    public static void main(String[] args) {
        
        //operadores aritmetico. 
        /*int a = 3, b = 10; 

        int resultado = a + b;
        System.out.println("resultado sum= " + resultado);

        //recordar que no se realiza la suma debido a que del lado izq hay un string y del lado 
        //derecho solo hace la concatenacion. 
        System.out.println("resultado concatenacion = " +a+b);

        //Solo con parentesis se hace el resultado ya que rompe el contexto string
        System.out.println("resultado suma con parentesis= " +(a+b));

        resultado = a - b;
        System.out.println("resultado rest= " + resultado);

        //no se puede usar - ya que solo tiene un uso, el unico con dos usos es el +
        System.out.println("resultado resta con parentesis= " +(a-b));

        resultado = a * b;
        System.out.println("resultado mult= " + resultado);

        resultado = a/b;
        System.out.println("resultado div= " + resultado);

        resultado = a%b;
        System.out.println("resultado mod = " + resultado);

        //ejemplo pares impares

        if (a%2==0) {
            System.out.println(a+ " es par");
        }
        else {
            System.out.println(a + " es impar");
        }

        if (b%2==0) {
            System.out.println(b + " es par");
        }
        else {
            System.out.println(b + " es impar");
        }*/


        //operadores de asignacion en java
        /*int a = 10, b = 200;
        int c = a; 

        System.out.println("c = "+ c);

        //operadores de composicion. 
        a +=1; // a= a+1;
        System.out.println("a sum = "+ a);
        b +=10; // a= a+1;
        System.out.println("b = "+ b);

        b-=1;
        System.out.println("b resta = "+ b);

        a*=10;
        System.out.println("a mult = "+ a);
        a/=2;
        System.out.println("a div = "+ a);*/


        //operadores unario

        /*int a = 15;

        int b = -a;

        System.out.println("b = "+ b);

        boolean c =true;
        boolean d = !c;
        System.out.println("d = "+ d);

        //preincremento primero se incrementa y luego se asigna
        int e = 3;
        int f = ++e;
        System.out.println("e = "+ e);
        System.out.println("f = "+ f);

        //postincremento primero se asigna y luego se incrementa
        int g = 5;
        int h = g++;
        System.out.println("g = "+ g);
        System.out.println("h = "+ h);*/

        //operadores de igualdad y relacionales. 

        /*int a = 3, b= 3;

        boolean c = a == b;

        System.out.println(c);

        c = a!=b;

        System.out.println(c);

        //== y != solo se usan en primitivos y no en objects 

        String cadena = "Hola";
        String cadena1 = "adios";

        System.out.println(cadena.equals(cadena1));

        boolean d = a>b;

        System.out.println(d);

        if (b%2==0) {
            System.out.println(b + " es par");
        }
        else {
            System.out.println(b + " es impar");
        }

        var edad = 8;

        int edadAdulto = 18;

        if (edad >= edadAdulto) {
            System.out.println("Es adulto");
        }
        else{
            System.out.println("No es adulto");
        }*/

        //Operadores condicionales

        /*int a = 20;

        int valorMinimo = 0, valorMaximo = 10;
        boolean resultado = a >= valorMinimo && a <= valorMaximo; //and

        System.out.println(resultado);

        boolean vacaciones = false;
        boolean diadescanso = false;

        if (vacaciones || diadescanso) {
            System.out.println("Puede ir");
        }
        else{
            System.out.println("no puede ir");
        }*/

        //operador ternario

        var resultado = (3>2) ? true : false;

        System.out.println(resultado);
        var numero = 10;
        var par = (numero % 2 == 0) ? "numero par" : "numero impar";

        System.out.println(par);
    }

}