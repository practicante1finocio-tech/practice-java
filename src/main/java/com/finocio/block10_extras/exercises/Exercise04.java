package com.finocio.block10_extras.exercises;

/**
 * Exercise04:
 * Crea una variable global message y otra local message dentro del método main().
 * Muestra ambas.
 */
public class Exercise04 {
    static String message = "Mensaje global";

    public static void main(String[] args) {
        String message = "Mensaje local";

        System.out.println("Variable global: " + Exercise04.message);
        System.out.println("Variable local: " + message);
    }
}
/*
Explicación:
- La variable estática o global pertenece a la clase.
- La variable local solo existe dentro del método.
- Se puede acceder a la global con NombreClase.variable.
*/
