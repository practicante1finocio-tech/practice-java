package com.finocio.block08_oop.classes_and_objects.examples;

public class Classes {

    public static void main(String[] args) {

        var person = new Person("Jaico", 34);

        // person.name = "Jaico";
        // person.age = 34;

        person.sayHello();

        person.name = "Jaico Jara";

        System.out.println(person.name);

        var person2 = new Person("Statham", 25);
        person2.sayHello();
    }
}
