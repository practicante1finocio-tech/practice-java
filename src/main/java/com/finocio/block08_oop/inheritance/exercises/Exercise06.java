package com.finocio.block08_oop.inheritance.exercises;

/**
 * Ejercicio 06:
 * Crea una clase Bird con el método fly().
 * Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
 */

public class Exercise06 {

    public static void main(String[] args) {

        // Crear un pájaro genérico
        Bird bird = new Bird("Pio");
        bird.fly();

        // Crear un águila
        Eagle eagle = new Eagle("Aguila real");
        eagle.fly();
    }

    // Clase base Bird
    public static class Bird {

        String name;

        public Bird(String name) {
            this.name = name;
        }

        // Método fly de la clase base
        public void fly() {
            System.out.println(name + " está volando de manera normal.");
        }
    }

    // Clase derivada Eagle que sobrescribe fly()
    public static class Eagle extends Bird {

        public Eagle(String name) {
            super(name);  // Llamamos al constructor de Bird
        }

        @Override
        public void fly() {
            // Llamamos al método de la clase base
            super.fly();
            // Agregamos comportamiento adicional
            System.out.println(name + " ahora vuela a gran velocidad.");
        }
    }
}
