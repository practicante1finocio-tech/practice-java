package com.finocio.block08_oop.polymorphism.exercises;

/**
 * Exercise 04:
 * Crea una clase Greeter con dos métodos greet():
 * - Uno que salude con “Hello”
 * - Otro que reciba un nombre y salude con “Hello, [nombre]”
 */

public class Exercise04 {

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        // Llamadas a métodos sobrecargados
        greeter.greet();
        greeter.greet("Jaico");
    }

    public static class Greeter {

        // Saludo genérico
        public void greet() {
            System.out.println("Hello");
        }

        // Saludo personalizado
        public void greet(String name) {
            System.out.println("Hello, " + name);
        }
    }
}
