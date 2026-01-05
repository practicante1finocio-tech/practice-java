package com.finocio.block08_oop.access_modifiers.exercises;

/**
 * Ejercicio 2:
 * Crear una clase Product con el atributo privado price.
 * Añadir el método setPrice(double price) que solo permita precios mayores a 0.
 */

public class Product {

    // Atributos privados: solo accesibles dentro de la clase
    private String name;
    private double price;

    // Constructor: inicializa el nombre y el precio usando el setter para validar
    public Product(String name, double price) {
        this.name = name;
        setPrice(price);        // asigna el precio usando el setter con validación
    }

    // Getter para leer el nombre del producto
    public String getName() {
        return name;
    }

    // Setter para modificar el nombre del producto
    public void setName(String name) {
        this.name = name;
    }

    // Getter para leer el precio del producto
    public double getPrice() {
        return price;
    }

    // Setter para modificar el precio con validación
    public void setPrice(double price) {
        if (price > 0) {        // validamos que el precio sea mayor que 0
            this.price = price;
        } else {
            System.out.println("Precio no válido. Debe ser mayor que 0.");
        }
    }

    // Método main para probar la clase
    public static void main(String[] args) {

        // Crear un objeto Product con nombre y precio inicial
        Product product = new Product("PlayStation5", 399.95);

        // Mostrar valores iniciales usando getters
        System.out.println("Nombre: " + product.getName());
        System.out.println("Precio: " + product.getPrice() + " €");

        // Modificar el nombre y el precio usando setters
        product.setName("PlayStation 5");
        product.setPrice(-5);

        // Mostrar los valores actualizados usando getters
        System.out.println("Nombre: " + product.getName());
        System.out.println("Precio: " + product.getPrice() + " €");
    }
}
