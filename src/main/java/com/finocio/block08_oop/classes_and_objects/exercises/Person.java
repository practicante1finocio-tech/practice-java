package com.finocio.block08_oop.classes_and_objects.exercises;

// Ejercicio 9
// Crear varios objetos de tipo Person.
// Guardarlos en un ArrayList.

import java.util.ArrayList;

public class Person {

    String name;
    int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Nombre: " + name + ", Edad: " + age);
    }

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Jaico", 34));
        people.add(new Person("Ana", 20));
        people.add(new Person("Javier", 25));

        // Recorremos el ArrayList y para cada persona mostramos sus datos
        for (Person person : people) {
            person.showInfo();
        }
    }
}
