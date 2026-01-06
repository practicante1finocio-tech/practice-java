package com.finocio.block10_extras.exercises;

import java.util.Scanner;

/**
 * Exercise05:
 * Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
 */
public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }
    }
}
/*
Explicación:
- Scanner se importa para leer datos de usuario.
- Condicional if-else para comprobar si el número es positivo o negativo.
*/
