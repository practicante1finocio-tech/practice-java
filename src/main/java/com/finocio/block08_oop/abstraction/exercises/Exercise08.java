package com.finocio.block08_oop.abstraction.exercises;

/**
 * Ejercicio 8:
 * Crear dos interfaces Flyable y Swimmable.
 * Crear una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
 */

public class Exercise08 {

    public interface Flyable {
        void fly();
    }

    public interface Swimmable {
        void swim();
    }

    public static class Duck implements Flyable, Swimmable {
        @Override
        public void fly() {
            System.out.println("El pato está volando.");
        }

        @Override
        public void swim() {
            System.out.println("El pato está nadando.");
        }
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}

/*
Explicación:
- Duck implementa dos interfaces diferentes: Flyable y Swimmable.
- Cada interfaz define un comportamiento específico (volar y nadar).
- La clase Duck puede hacer ambas cosas y muestra cómo combinar múltiples interfaces.
*/
