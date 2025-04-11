package com.programacionFuncional;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("EJEMPLOS DE PROGRAMACIÓN FUNCIONAL EN JAVA");
        System.out.println("=========================================\n");

        // 1. Ejemplos de operaciones con Streams
        System.out.println("1. OPERACIONES CON STREAMS");
        System.out.println("-------------------------");
        StreamOperations.demonstrateBasicStreamOperations();
        System.out.println();

        // 2. Ejemplos de programación funcional
        System.out.println("2. EJEMPLOS DE PROGRAMACIÓN FUNCIONAL");
        System.out.println("-----------------------------------");
        FunctionalExamples.demonstrateFunctionAsValues();
        System.out.println();

        // 3. Ejemplos de funciones de orden superior
        System.out.println("3. FUNCIONES DE ORDEN SUPERIOR");
        System.out.println("-----------------------------");
        HigherOrderFunctions.demonstrateHigherOrderFunctions();
        System.out.println();

        // 4. Efectos secundarios
        // Son modificaciones del estado de un objeto o variable
        // No puede ser modificable porque tiene que ser determinista
        System.out.println("4.EFECTOS SECUNDARIOS");
        System.out.println("-----------------------------");
        final int  x = 10;
        //Tiene que ser determinista por lo que es final
        Function<Integer,Integer> op = a -> a+x;
        //La funcion depende de una variable externa x = 10
        //Por lo que no es pura y no tiene transparencia referencial
        //Evaluacion perezosa es cuando no se evalua la funcion hasta que se necesita
        op.apply(5);

        //Ejemplo de Transparencia referencial
        int y = 3;
        Function<Integer, Function<Integer, Integer>>
                opDos = a -> b -> a + b;
        System.out.println("El resultado es: " + opDos.apply(5).apply(y));

        y = 7;
        System.out.println("El resultado es: " + opDos.apply(5).apply(y));
        System.out.println("=========================================");
    }
}