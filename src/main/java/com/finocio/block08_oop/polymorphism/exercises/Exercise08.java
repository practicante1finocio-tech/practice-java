package com.finocio.block08_oop.polymorphism.exercises;

/**
 * Exercise 08:
 * Crea una clase Converter con métodos convert(int),
 * convert(double) y convert(String) que devuelvan
 * diferentes formatos de texto.
 */

public class Exercise08 {

    public static void main(String[] args) {

        Converter converter = new Converter();

        System.out.println(converter.convert(10));
        System.out.println(converter.convert(3.5));
        System.out.println(converter.convert("Java"));
    }

    public static class Converter {

        // Convierte un entero
        public String convert(int value) {
            return "Integer value: " + value;
        }

        // Convierte un double
        public String convert(double value) {
            return "Double value: " + value;
        }

        // Convierte un String
        public String convert(String value) {
            return "String value: " + value.toUpperCase();
        }
    }
}
