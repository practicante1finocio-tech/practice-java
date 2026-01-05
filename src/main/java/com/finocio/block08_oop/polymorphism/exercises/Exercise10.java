package com.finocio.block08_oop.polymorphism.exercises;

/**
 * Exercise10:
 * Crea una clase Character con método attack().
 * Luego crea subclases Warrior, Archer, Mage con ataques diferentes.
 * En main, crea un array de Character y llama a attack() para cada uno.
 */

public class Exercise10 {

    public static void main(String[] args) {

        Character[] fight = {
                new Warrior("Conan"),
                new Archer("Legolas"),
                new Mage("Gandalf")
        };

        for (Character character : fight) {
            character.attack();
        }
    }

    //  Clase base
    public static class Character {

        protected String name;

        public Character(String name) {
            this.name = name;
        }

        public void attack() {
            System.out.println(name + " ataca de forma básica");
        }
    }

    //  Subclase Warrior
    public static class Warrior extends Character {

        public Warrior(String name) {
            super(name);
        }

        @Override
        public void attack() {
            System.out.println(name + " golpea con su espada");
        }
    }

    //  Subclase Archer
    public static class Archer extends Character {

        public Archer(String name) {
            super(name);
        }

        @Override
        public void attack() {
            System.out.println(name + " dispara una flecha");
        }
    }

    //  Subclase Mage
    public static class Mage extends Character {

        public Mage(String name) {
            super(name);
        }

        @Override
        public void attack() {
            System.out.println(name + " lanza un hechizo mágico");
        }
    }
}
