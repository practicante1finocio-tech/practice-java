package com.finocio.block09_exceptions.exercises;

/**
 * Ejercicio 2:
 * Crea un array de 3 elementos e intenta acceder al índice 5.
 * Captura el ArrayIndexOutOfBoundsException.
 */
public class Exercise02 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[5]); // Índice fuera de rango
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del array");
        }
    }
}
