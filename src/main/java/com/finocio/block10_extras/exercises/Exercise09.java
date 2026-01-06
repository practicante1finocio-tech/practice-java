package com.finocio.block10_extras.exercises;

/**
 * Exercise09:
 * Define una clase User con una constante APP_NAME, una variable global username
 * y una función que imprima ambas.
 */
public class Exercise09 {
    static final String APP_NAME = "MiApp";
    static String username = "Jaico";

    public static void showInfo() {
        System.out.println("App: " + APP_NAME);
        System.out.println("Usuario: " + username);
    }

    public static void main(String[] args) {
        showInfo();
    }
}
/*
Explicación:
- APP_NAME es constante, username es variable estática.
- Método showInfo muestra ambos valores.
*/
