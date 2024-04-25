# Java

Este archivo es usado con el fin de tener un formulario que sea util para java y que sea revizado en caso de tener alguna duda.

## Break y Continue

### Break

Para este caso el **Break** lo que hace es romper la ejecucion de un ciclo (for, while, do while) definitivamente.

Ejemplo:

for ( i=0; i<3; i++){
    System.out.println("i = " + i);
    break;
}
Salida:

i = 0

Como vemos el ciclo termina una vez paso por el break.  

### Continue

 Y el **Continue** es usado con el fin de que una vez pasa algo y llegamos a el esa iteracion termina y se pasa al siguiente pero sin matar el ciclo.

 Ejemplo: Impresion de numeros pares.

 for ( i=0; i<4; i++){
    if(i%2!=0){
        continue;
    }
     System.out.println("i = " + i);
 }

Salida:

i = 0

i = 2

Como vemos el ciclo se salta de imprimir el 1 ya que al llegar al continue desecha salta automaticamente al siguente sin pasar por lo demas.

## Labels

Esto solo se ocupa para añadir mas claridad al codigo al momento de usar continue o break. Pero no son necesarias.

Ejemplo: Impresion de codigos pares.

inicio:
 for ( i=0; i<4; i++){
    if(i%2!=0){
        continue inicio;
    }
     System.out.println("i = " + i);
 }

 Ejemplo:

inicio:
 for ( i=0; i<3; i++){
    System.out.println("i = " + i);
    break inicio;
 }

## Clases

Una clase es una plantilla de la que podemos generar mas objetos.

    - Posee un nombre.
    - Posee atributos y metodos. 

Existen los tipos referenciados, que recordando tienen clases, arrglos y interfaces.

### Forma general

**Se guarda con .java**

```java
class NombreDeLaClase{

    tipoDato variable1;
    tipoDato variable2;

    tipoDato nombreMetodo1{
        //cuerpo del metodo
    }

    tipoDato nombreMetodo2{
        //cuerpo del metodo
    }

    tipoDato nombreMetodo3{
        //cuerpo del metodo
    }
} 
~~~

## Objetos

Es una instancia de una clase.
