package com.finocio.block08_oop.polymorphism.exercises;

import java.util.ArrayList;

/**
 * Exercise 01:
 * Crea una clase Animal con el método makeSound().
 * Luego crea subclases Dog, Cat y Cow que sobrescriban ese método
 * con sonidos diferentes.
 * Llama al método desde una lista de Animal.
 */

public class Exercise01 {

    public static void main(String[] args) {

        // Lista de animales (polimorfismo)
        ArrayList<Animal> animals = new ArrayList<>();

        // Añadimos diferentes tipos de Animal
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        // Recorremos la lista y llamamos al mismo método
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    // Clase base
    public static class Animal {
        public void makeSound() {
            System.out.println("El animal hace un sonido");
        }
    }

    // Subclase Dog
    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    // Subclase Cat
    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    // Subclase Cow
    public static class Cow extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Moo");
        }
    }
}
