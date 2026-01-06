package com.finocio.block08_oop.classes_and_objects.exercises;

// Ejercicio 2
// Crear una clase Dog con un método bark() que imprima el sonido del perro.

public class Dog {

    String name;
    String breed;

    public Dog (String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void bark(){
        System.out.println(name + " es un " + breed + " y hace: Woof! Woof!");
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Hachi", "Labrador");
        dog1.bark();

        Dog dog2 = new Dog("Max", "Pastor Alemán");
        dog2.bark();
    }
}
