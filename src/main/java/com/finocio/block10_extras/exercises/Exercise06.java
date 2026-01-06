package com.finocio.block10_extras.exercises;

/**
 * Exercise06:
 * Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
 */
public class Exercise06 {
    static String appName = "Mi Aplicación";

    public static void main(String[] args) {
        System.out.println("Nombre de la app: " + appName);
    }
}
/*
Explicación:
- Las variables static pertenecen a la clase, no a un objeto.
- Se pueden usar directamente dentro de main.
*/
