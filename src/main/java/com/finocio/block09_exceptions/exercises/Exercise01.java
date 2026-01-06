package com.finocio.block09_exceptions.exercises;

/**
 * Ejercicio 1:
 * Divide dos números almacenados en dos variables.
 * Maneja la división por cero con try-catch.
 */
public class Exercise01 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;  // Esto provocará ArithmeticException si b es 0
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero");
        }
    }
}
