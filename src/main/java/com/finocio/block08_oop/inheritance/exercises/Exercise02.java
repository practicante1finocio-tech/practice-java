package com.finocio.block08_oop.inheritance.exercises;

/**
 * Ejercicio 02:
 * Define una clase Person con los atributos name y age.
 * Luego crea una clase Student que agregue el atributo grade y un método study().
 */

public class Exercise02 {

    public static void main(String[] args) {

        // Crear un objeto Person
        Person person = new Person("Jaico", 34);
        person.showInfo();

        // Crear un objeto Student
        Student student = new Student("Ana", 28, 85);
        student.showInfo(); // Método heredado de Person
        student.study();    // Método propio de Student
    }

    // Clase padre
    public static class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void showInfo() {
            System.out.println("Nombre: " + name + ", Edad: " + age);
        }
    }

    // Clase hija
    public static class Student extends Person {

        int grade;

        public Student(String name, int age, int grade) {
            super(name, age); // Llamada al constructor de Person
            this.grade = grade;
        }

        public void study() {
            System.out.println(name + " está estudiando y tiene una nota de: " + grade);
        }
    }
}
