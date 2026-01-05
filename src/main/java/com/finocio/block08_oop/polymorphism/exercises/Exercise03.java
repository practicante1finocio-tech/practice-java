package com.finocio.block08_oop.polymorphism.exercises;

/**
 * Exercise 03:
 * Crea una clase Printer con varios métodos print() sobrecargados
 * que acepten diferentes tipos de parámetros (String, int, double).
 * Llama a cada uno desde main.
 */

public class Exercise03 {

    public static void main(String[] args) {

        Printer printer = new Printer();

        // Llamadas a métodos sobrecargados
        printer.print("Hola mundo");
        printer.print(10);
        printer.print(3.14);
    }

    public static class Printer {

        // Imprime un String
        public void print(String text) {
            System.out.println("Texto: " + text);
        }

        // Imprime un entero
        public void print(int number) {
            System.out.println("Número entero: " + number);
        }

        // Imprime un double
        public void print(double number) {
            System.out.println("Número decimal: " + number);
        }
    }
}
