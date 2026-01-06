package com.finocio.block08_oop.abstraction.exercises;

/**
 * Ejercicio 3:
 * Definir una clase abstracta Animal con el método makeSound().
 * Implementar Dog y Cat para hacer sonidos distintos.
 * Crear un array de Animal para mostrar polimorfismo.
 */

public class Exercise03 {

    public static abstract class Animal {
        public abstract void makeSound();
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog dice: Woof!");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Cat dice: Meow!");
        }
    }

    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

/*
Explicación:
- Animal es abstracta, obliga a implementar makeSound() en subclases.
- Dog y Cat sobrescriben makeSound() con sonidos propios.
- El array de Animal demuestra polimorfismo: aunque todos son Animal, se ejecuta el método correcto de cada subclase.
*/
