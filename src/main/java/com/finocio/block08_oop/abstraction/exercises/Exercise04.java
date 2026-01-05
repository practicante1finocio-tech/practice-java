package com.finocio.block08_oop.abstraction.exercises;

/**
 * Ejercicio 4:
 * Crear una interfaz Drawable.
 * Implementar Circle, Square y Triangle que dibujen cada figura con draw().
 */

public class Exercise04 {

    public interface Drawable {
        void draw();
    }

    public static class Circle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un círculo");
        }
    }

    public static class Square implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un cuadrado");
        }
    }

    public static class Triangle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un triángulo");
        }
    }

    public static void main(String[] args) {
        Drawable[] shapes = { new Circle(), new Square(), new Triangle() };
        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}

/*
Explicación:
- Drawable es una interfaz que obliga a implementar draw().
- Cada clase tiene su propia implementación del dibujo.
- Polimorfismo: se puede recorrer un array de Drawable y cada objeto se comporta según su clase.
*/
