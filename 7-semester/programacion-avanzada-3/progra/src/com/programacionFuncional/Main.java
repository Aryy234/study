package com.programacionFuncional;


public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("EJEMPLOS DE PROGRAMACIÓN FUNCIONAL EN JAVA");
        System.out.println("=========================================\n");

        // 1. Ejemplos de operaciones con Streams
        System.out.println("1. OPERACIONES CON STREAMS");
        System.out.println("-------------------------");
        StreamOperations.demonstrateBasicStreamOperations();
        System.out.println("=========================================");
        System.out.println();

        // 2. Ejemplos de programación funcional
        System.out.println("2. EJEMPLOS DE PROGRAMACIÓN FUNCIONAL");
        System.out.println("-----------------------------------");
        FunctionalExamples.demonstrateFunctionAsValues();
        System.out.println("=========================================");
        System.out.println();

        // 3. Ejemplos de funciones de orden superior
        System.out.println("3. FUNCIONES DE ORDEN SUPERIOR");
        System.out.println("-----------------------------");
        HigherOrderFunctions.demonstrateHigherOrderFunctions();
        System.out.println("=========================================");
        System.out.println();

        // 4. Efectos secundarios
        System.out.println("4. EFECTOS SECUNDARIOS");
        System.out.println("-----------------------------");
        SideEffects.demonstrateSideEffects();
        System.out.println("=========================================");
        System.out.println();

        // 5. TRANSPARENCIA REFERENCIAL Y FUNCIONES PURAS
        System.out.println("5. TRANSPARENCIA REFERENCIAL Y FUNCIONES PURAS");
        System.out.println("--------------------------------------------");
        PureFunctionsExamples.demonstratePureFunctions();
        System.out.println("=========================================");
        System.out.println();

        // 6. FUNCIONES PARCIALES
        System.out.println("6. FUNCIONES PARCIALES");
        System.out.println("-----------------------------");
        PartialFunctions.demonstratePartialFunctions();
        System.out.println("=========================================");
        System.out.println();
    }
}