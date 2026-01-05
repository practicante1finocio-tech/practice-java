package com.finocio.block08_oop.inheritance.exercises;

/**
 * Ejercicio 03:
 * Crea una clase Animal con el método makeSound().
 * Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
 */

public class Exercise03 {

    public static void main(String[] args) {

        // Crear objetos

        Dog dog = new Dog();
        dog.makeSound();            // Sonido de perro

        Cat cat = new Cat();
        cat.makeSound();            // Sonido de gato
    }

    // Clase padre
    public static class Animal {

        public void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

    // Clase hija Dog
    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    // Clase hija Cat
    public static class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }
}
