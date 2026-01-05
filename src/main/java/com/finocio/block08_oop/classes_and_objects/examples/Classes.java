package com.finocio.block08_oop.classes_and_objects.examples;

public class Classes {

    public static void main(String[] args) {

        var person = new Person("Jaico", -34, "123456789A");

        // person.name = "Jaico";
        // person.age = 34;

        person.sayHello();

        person.name = "Jaico Jara";
        System.out.println(person.name);

        // person.id = "123456789A";

        System.out.println(person.getId());

        person.setAge(34);
        System.out.println(person.getAge());

        var person2 = new Person("Statham", 25, "123456789B");
        person2.sayHello();
    }
}
