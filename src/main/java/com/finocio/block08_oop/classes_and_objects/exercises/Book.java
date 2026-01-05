package com.finocio.block08_oop.classes_and_objects.exercises;

// Ejercicio 1 y 3
// Crear una clase Book con los atributos title y author.
// Añadir un constructor a la clase Book que reciba title y author
// y los asigne a los atributos de la clase.
// Crear un objeto de tipo Book y mostrar sus datos por consola.

public class Book {

    // Atributos de la clase
    String title;
    String author;

    // Crear constructor
    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Método para mostrar información
    public void showInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {

        // Crea un objeto y mostrar datos

        Book myBook1 = new Book("Harry Potter" , "J. K. Rowling");
        myBook1.showInfo();

        Book myBook2 = new Book("El Señor de los Anillos" , "J. R. R. Tolkien");
        myBook2.showInfo();
    }
}
