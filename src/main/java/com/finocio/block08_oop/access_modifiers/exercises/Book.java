package com.finocio.block08_oop.access_modifiers.exercises;

/**
 * Ejercicio 4:
 * Crear una clase Book con el atributo privado title.
 * Permitir leerlo con getTitle() pero no modificarlo (sin setTitle()).
 * El título se asigna solo en el constructor.
 */

public class Book {

    // Atributo privado: solo accesible dentro de la clase
    private String title;

    // Constructor: inicializa el título al crear el objeto
    public Book(String title) {
        this.title = title;
    }

    // Getter: permite leer el título desde fuera de la clase
    public String getTitle() {
        return title;
    }

    // No hay setter, por lo que el título no puede modificarse después

    public static void main(String[] args) {

        // Crear un libro
        Book book = new Book("El Señor de los Anillos");

        // Leer y mostrar el título usando getter
        System.out.println("Título del libro: " + book.getTitle());

        // book.setTitle("Otro título"); // Esto NO se puede, no hay setter
    }
}
