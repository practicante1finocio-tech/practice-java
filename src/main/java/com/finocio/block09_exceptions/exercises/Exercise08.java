package com.finocio.block09_exceptions.exercises;

/**
 * Ejercicio 8:
 * Programa con varios bloques catch:
 * uno para ArithmeticException y otro para ArrayIndexOutOfBoundsException.
 */
public class Exercise08 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(10 / 0); // ArithmeticException
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango");
        }
    }
}
