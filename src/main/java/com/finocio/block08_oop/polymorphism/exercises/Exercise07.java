package com.finocio.block08_oop.polymorphism.exercises;

/**
 * Exercise 07:
 * Crea una función showAnimalType(Animal animal)
 * que imprima el tipo de animal.
 * Pasa diferentes subclases (Dog, Cat, Horse)
 * para que cada una imprima su tipo con su propio
 * getType() sobrescrito.
 */

public class Exercise07 {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal horse = new Horse();

        showAnimalType(dog);
        showAnimalType(cat);
        showAnimalType(horse);
    }

    // MÉTODO POLIMÓRFICO
    public static void showAnimalType(Animal animal) {
        System.out.println(animal.getType());
    }

    // Clase base
    public static class Animal {

        public String getType() {
            return "Unknown animal";
        }
    }

    // Subclase Dog
    public static class Dog extends Animal {

        @Override
        public String getType() {
            return "Dog";
        }
    }

    // Subclase Cat
    public static class Cat extends Animal {

        @Override
        public String getType() {
            return "Cat";
        }
    }

    // Subclase Horse
    public static class Horse extends Animal {

        @Override
        public String getType() {
            return "Horse";
        }
    }
}
