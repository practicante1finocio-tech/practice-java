package com.finocio.block08_oop.abstraction.exercises;

/**
 * Ejercicio 1:
 * Crear una clase abstracta Shape con el método calculateArea().
 * Implementar dos subclases: Circle y Rectangle,
 * cada una debe calcular su propia área.
 */

public class Exercise01 {

    public static abstract class Shape {
        public abstract double calculateArea();
    }

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

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Área del círculo: " + circle.calculateArea());
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());
    }
}

/*
Explicación:
- Shape es abstracta, no puede instanciarse directamente.
- calculateArea() es abstracto, por eso Circle y Rectangle deben implementarlo.
- Circle y Rectangle calculan su área usando sus fórmulas.
- Polimorfismo: en main podemos usar Shape como tipo y asignar cualquier subclase.
*/
