package com.finocio.block09_exceptions.exercises;

/**
 * Ejercicio 9:
 * Función checkPassword(String pass) que lance una excepción
 * si la contraseña es demasiado corta.
 */
public class Exercise09 {

    public static void checkPassword(String password) throws Exception {
        if (password.length() < 6) {
            throw new Exception("Contraseña demasiado corta");
        } else {
            System.out.println("Contraseña válida");
        }
    }

    public static void main(String[] args) {
        try {
            checkPassword("123");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
