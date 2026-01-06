package com.finocio.block09_exceptions.exercises;

/**
 * Ejercicio 5:
 * Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
 */
public class Exercise05 {

    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error al dividir");
        } finally {
            System.out.println("Este bloque finally siempre se ejecuta");
        }
    }
}
