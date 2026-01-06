package com.finocio.block10_extras.exercises;

import java.util.Scanner;

/**
 * Exercise02:
 * Escribe un programa que lea el nombre y edad del usuario usando Scanner.
 */
public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String name = scanner.nextLine();

        System.out.println("Introduce tu edad: ");
        int age = scanner.nextInt();

        System.out.println("Nombre: " + name + ", Edad: " + age);
    }
}
/*
Explicación:
- Scanner permite leer entradas por consola.
- nextLine() lee texto, nextInt() lee números enteros.
- Mostramos los datos para verificar la lectura.
*/

