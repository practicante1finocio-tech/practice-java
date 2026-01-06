package com.finocio.block09_exceptions.exercises;

/**
 * Ejercicio 3:
 * Crea una variable String nula e intenta imprimir su longitud.
 * Maneja el NullPointerException.
 */
public class Exercise03 {

    public static void main(String[] args) {
        String text = null;

        try {
            System.out.println("Longitud: " + text.length()); // Provocará NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: La variable es nula, no se puede obtener la longitud");
        }
    }
}
