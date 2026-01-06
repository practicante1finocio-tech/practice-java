package com.finocio.block08_oop.classes_and_objects.exercises;

// Ejercicio 10
// Crear una clase Product con un atributo price.
// Añadir un método que aplique un descuento al precio del producto.

public class Product {

    String name;
    double price;

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        double discount = price * (percentage / 100);
        price = price - discount;
    }

    public void showInfo() {
        System.out.println("El producto: " + name + " tiene un precio de: " + price);
    }

    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000);
        product.applyDiscount(10);
        product.showInfo();
    }
}
