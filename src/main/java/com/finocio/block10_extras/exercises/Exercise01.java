package com.finocio.block10_extras.exercises;

/**
 * Exercise01:
 * Crea una variable de tipo String inicializada como null
 * y verifica que no esté vacía antes de usarla.
 */

public class Exercise01 {

    public static void main(String[] args) {

        // Variable String inicializada como null
        String name = null;

        // Verificar antes de usarla
        if (name != null) {
            System.out.println("El nombre es: " + name.toLowerCase());
        } else {
            System.out.println("La variable 'name' es null y no se puede usar.");
        }
    }
}

/*
Explicación:
- Se crea una variable de tipo String inicializada como null.
- Antes de usarla (convertir a minúsculas con toLowerCase()), se verifica que no sea null.
- Esto evita el famoso NullPointerException.
- Es una buena práctica siempre validar que las referencias no sean null antes de usarlas.
*/
