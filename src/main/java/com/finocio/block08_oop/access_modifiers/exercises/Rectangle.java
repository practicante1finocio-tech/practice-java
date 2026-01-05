package com.finocio.block08_oop.access_modifiers.exercises;

/**
 * Ejercicio 8:
 * Crear una clase Rectangle con atributos privados width y height.
 * Agregar setters y un método calculateArea() que devuelva width * height.
 */

public class Rectangle {

    // Atributos privados
    private double width;
    private double height;

    // Constructor: inicializa el rectángulo con valores opcionales
    public Rectangle(double width, double height) {
        setWidth(width);   // usamos setters para validación
        setHeight(height);
    }

    // Setter para width
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Ancho no válido, debe ser positivo");
            this.width = 0;
        }
    }

    // Setter para height
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Altura no válida, debe ser positiva");
            this.height = 0;
        }
    }

    // Método para calcular el área
    public double calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(5, 10);
        System.out.println("Área del rectángulo: " + rect1.calculateArea());

        Rectangle rect2 = new Rectangle(-3, 7); // prueba invalidación
        System.out.println("Área del rectángulo: " + rect2.calculateArea());
    }
}
