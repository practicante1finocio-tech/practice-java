package com.finocio.block09_exceptions.exercises;

/**
 * Ejercicio 6:
 * Usa throw para lanzar un IllegalArgumentException
 * si un número introducido es negativo.
 */
public class Exercise06 {

    public static void checkNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        } else {
            System.out.println("Número válido: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
