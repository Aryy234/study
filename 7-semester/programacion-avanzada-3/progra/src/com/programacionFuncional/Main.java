package com.programacionFuncional;

import com.composicionClases.BinaryOperator;
import com.composicionClases.TernaryOperator;

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

        // 7. CURRIFICACIÓN
        System.out.println("7. CURRIFICACIÓN");
        System.out.println("-----------------------------");
        CurriedFunctions.demonstrateCurriedFunctions();
        System.out.println("=========================================");


        // 8. Ejemplos de programación funcional 2
        System.out.println("8. EJEMPLOS DE PROGRAMACIÓN FUNCIONAL 2");
        System.out.println("-----------------------------");
        FunctionalExamples2.demostracion();
        System.out.println("=========================================");
        
        // 9. Composición de funciones
        System.out.println("9. COMPOSICIÓN DE FUNCIONES");
        System.out.println("-----------------------------");
        FunctionComposition.demonstrateFunctionComposition();
        System.out.println("=========================================");        
        
        // 10. Composición de funciones segunda parte
        System.out.println("10. COMPOSICIÓN DE FUNCIONES SEGUNDA PARTE");
        System.out.println("-----------------------------");
        FunctionComposition2.demonstrateFunctionComposition2();
        System.out.println("=========================================");

        // 11 Interfaces operadores composición de funciones
        System.out.println("11. INTERFACES OPERADORES COMPOSISION DE FUNCIONES");
        System.out.println("-----------------------------");
        BinaryOperator<Integer> binaryOperator = (a) -> (b) -> a + b;
        TernaryOperator<Integer> ternaryOperator = (a) -> (b) -> (c) -> a + b + c;
        System.out.println("BinaryOperator: " + binaryOperator.apply(2).apply(3)); // 5
        System.out.println("TernaryOperator: " + ternaryOperator.apply(2).apply(3).apply(4)); // 9
        System.out.println("=========================================");



    }    // Todos los métodos relacionados con la composición se han movido
    // a las clases FunctionComposition y FunctionComposition2

    
    
}