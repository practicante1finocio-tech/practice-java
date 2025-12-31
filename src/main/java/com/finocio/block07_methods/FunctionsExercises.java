package com.finocio.block07_methods;

import java.util.ArrayList;

public class FunctionsExercises {

    public static void main(String[] args) {

        System.out.println("\nEJERCICIO 1");
        welcome();
        System.out.println();

        System.out.println("EJERCICIO 2");
        String name = "Jaico";
        greet(name);
        System.out.println();

        System.out.println("EJERCICIO 3");
        int firstNumber = 4;
        int secondNumber = 6;
        subtract(firstNumber, secondNumber);
        System.out.println();

        System.out.println("EJERCICIO 4");
        int n = 2;
        square(n);
        System.out.println();

        System.out.println("EJERCICIO 5");
        int number = 5;
        checkEvenOdd(number);
        System.out.println();

        System.out.println("EJERCICIO 6");
        int age = 20;
        System.out.println(isAdult(age));
        System.out.println();

        System.out.println("EJERCICIO 7");
        String  text = "¿Qué longitud tiene esta frase?";
        System.out.println(stringLength(text));
        System.out.println();

        System.out.println("EJERCICIO 8");
        int[] numbers = {2,47,6,8,11};
        System.out.println(calculateAverage(numbers));
        System.out.println();

        System.out.println("EJERCICIO 9");
        int numberFactorial = 5;
        System.out.println(factorial(numberFactorial));
        System.out.println();

        System.out.println("EJERCICIO 10");
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("Green");
        colourList.add("White");
        printList(colourList);
        System.out.println();
    }

    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".

    public static void welcome() {

        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Crea una función que reciba un nombre como parámetro y salude a esa persona.

    public static void greet(String name) {

        System.out.println("Hola, " + name);
    }

    // 3. Crea una función que reciba dos números enteros y devuelva su resta.

    public static void subtract(int firstNumber, int secondNumber) {

        System.out.println("La resta es: " + (firstNumber - secondNumber));
    }

    // 4. Crea una función que calcule el cuadrado de un número (n * n).

    public static void square(int n) {

        System.out.println("El cuadrado es: " + (n * n));
    }
    
    // 5. Crea una función que reciba un número y diga si es par o impar.
    
    public static void checkEvenOdd(int number) {

        if (number %2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
    
    // 6. Crea una función que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).

    public static boolean isAdult(int age) {

        return age >= 18;
    }

    // 7. Crea una función que reciba una cadena y retorne su longitud.

    public static int stringLength(String text) {

        return text.length();
    }

    // 8. Crea una función que reciba un array de enteros, calcula su media y lo retorna.
    
    public static double calculateAverage(int[] numbers) {

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum / numbers.length;
        return average;

    }

    // 9. Crea una función que reciba un número y retorna su factorial.
    // Factorial: multiplicar ese número por todos los enteros positivos menores que él hasta llegar a 1.

        public static int factorial(int numberFactorial) {

        int factorial = 1;

            for (int i = 1; i <= numberFactorial; i++) {
                factorial *= i;
            }
            return factorial;
        }

    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

    public static void printList(ArrayList<String> colourList) {

        for (String color : colourList) {
            System.out.println(color);
        }
    }
}

