package com.finocio.block08_oop.polymorphism.exercises;

import java.util.ArrayList;

/**
 * Exercise 09:
 * Crea una clase Product con el método getPrice().
 * Luego Book y Electronic deben sobrescribirlo
 * con su propia lógica de descuento.
 * Recorre una lista de Product e imprime el precio final.
 */

public class Exercise09 {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Book("Clean Code", 30));
        products.add(new Electronic("Laptop", 1000));

        for (Product product : products) {
            System.out.println(
                    product.getName() + " - Precio final: " + product.getPrice() + " €"
            );
        }
    }

    //  Clase base
    public static class Product {

        protected String name;
        protected double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price; // precio base (sin descuento)
        }

        public String getName() {
            return name;
        }
    }

    //  Subclase Book
    public static class Book extends Product {

        public Book(String name, double price) {
            super(name, price);
        }

        @Override
        public double getPrice() {
            return price * 0.9; // 10% de descuento
        }
    }

    //  Subclase Electronic
    public static class Electronic extends Product {

        public Electronic(String name, double price) {
            super(name, price);
        }

        @Override
        public double getPrice() {
            return price * 0.8; // 20% de descuento
        }
    }
}
