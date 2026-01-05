package com.finocio.block08_oop.inheritance.exercises;

/**
 * Ejercicio 05:
 * Crea una clase abstracta Shape con un método calculateArea().
 * Luego implementa ese método en Circle y Rectangle.
 */

public class Exercise05 {

    public static void main(String[] args) {

        // Crear un círculo y un rectángulo
        Circle circle = new Circle(5);       // radio = 5
        Rectangle rectangle = new Rectangle(4, 6); // width = 4, height = 6

        // Mostrar áreas
        System.out.println("Área del círculo: " + circle.calculateArea());
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());
    }

    // Clase abstracta Shape
    public static abstract class Shape {
        // Método abstracto: cada subclase debe implementarlo
        public abstract double calculateArea();
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
