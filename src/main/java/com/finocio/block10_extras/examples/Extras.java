package com.finocio.block10_extras.examples;

import com.finocio.block08_oop.classes_and_objects.examples.Classes;
import com.finocio.block08_oop.classes_and_objects.examples.Person;
// import com.finocio.block08_oop.classes_and_objects.examples.*;

import java.util.Scanner;

public class Extras {

    static String globalName = "statham";

    public static void main(String[] args) {

        // Extras

        // null

        String name = "Jaico";
        name = null;
        if (name != null) {
            System.out.println(name.toLowerCase());
        }

        // import

        new Person("Jaico", 34, "1");
        new Classes();

        // Scanner

        var scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();

        System.out.println("La edad es: " + age);

        // Scope: variables globales y locales

        test();

        // static
    }

    public static void test() {
        System.out.println(globalName);
    }
}