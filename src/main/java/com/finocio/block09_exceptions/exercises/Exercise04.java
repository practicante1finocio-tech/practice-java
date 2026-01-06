package com.finocio.block09_exceptions.exercises;

/**
 * Ejercicio 4:
 * Escribe una función que transforme texto a número.
 * Usa try-catch para manejar entradas no válidas (NumberFormatException).
 */
public class Exercise04 {

    public static void main(String[] args) {
        String input = "123a"; // entrada inválida
        try {
            int number = Integer.parseInt(input); // Puede lanzar NumberFormatException
            System.out.println("Número convertido: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: entrada no válida, no se puede convertir a número");
        }
    }
}
