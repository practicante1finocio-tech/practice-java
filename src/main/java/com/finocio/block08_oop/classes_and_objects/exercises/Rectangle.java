package com.finocio.block08_oop.classes_and_objects.exercises;

// Ejercicio 7
// Crear una clase Rectangle.
// Añadir métodos para calcular el área y el perímetro del rectángulo.

public class Rectangle {

    double width;
    double height;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea () {
        System.out.println("El área es: " + (width * height));
    }

    public void calculatePerimeter() {
        System.out.println("El perímetro es: " + (2 * (width + height)));
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(6, 5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
