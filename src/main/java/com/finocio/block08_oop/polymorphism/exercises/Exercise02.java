package com.finocio.block08_oop.polymorphism.exercises;

import java.util.ArrayList;

/**
 * Exercise 02:
 * Crea una clase Shape con el método calculateArea().
 * Luego implementa subclases Circle y Rectangle con sus propias fórmulas.
 * Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
 */

public class Exercise02 {

    public static void main(String[] args) {

        // Lista de figuras (polimorfismo)
        ArrayList<Shape> shapes = new ArrayList<>();

        // Añadimos diferentes figuras
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Circle(3));

        // Recorremos la lista y calculamos el área
        for (Shape shape : shapes) {
            System.out.println("Área: " + shape.calculateArea());
        }
    }

    // Clase base Shape
    public static class Shape {

        public double calculateArea() {
            return 0;
        }
    }

    // Subclase Circle
    public static class Circle extends Shape {

        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // Subclase Rectangle
    public static class Rectangle extends Shape {

        double width;
        double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }
}
