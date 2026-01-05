package com.finocio.block08_oop.inheritance.exercises;

import java.util.ArrayList;

/**
 * Ejercicio 10:
 * Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird.
 * Recorre la lista y llama al método makeSound() de cada objeto.
 */

public class Exercise10 {

    public static void main(String[] args) {

        // Crear lista de animales
        ArrayList<Animal> animals = new ArrayList<>();

        // Añadir instancias de cada tipo
        animals.add(new Dog("Hachi"));
        animals.add(new Cat("Elvis"));
        animals.add(new Bird("Pio"));

        // Recorrer la lista y llamar a makeSound()
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    // Clase base Animal
    public static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void makeSound() {
            System.out.println(name + " hace un sonido genérico");
        }
    }

    // Subclase Dog
    public static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " dice: Woof!");
        }
    }

    // Subclase Cat
    public static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " dice: Meow!");
        }
    }

    // Subclase Bird
    public static class Bird extends Animal {
        public Bird(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " dice: Tweet!");
        }
    }
}
