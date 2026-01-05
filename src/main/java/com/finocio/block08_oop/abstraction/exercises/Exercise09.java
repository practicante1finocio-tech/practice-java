package com.finocio.block08_oop.abstraction.exercises;

/**
 * Ejercicio 9:
 * Crear una clase abstracta Document con el método print().
 * Crear PDFDocument y WordDocument con su forma específica de imprimir.
 */

public class Exercise09 {

    public static abstract class Document {
        public abstract void print();
    }

    public static class PDFDocument extends Document {
        @Override
        public void print() {
            System.out.println("Imprimiendo documento PDF...");
        }
    }

    public static class WordDocument extends Document {
        @Override
        public void print() {
            System.out.println("Imprimiendo documento Word...");
        }
    }

    public static void main(String[] args) {
        Document pdf = new PDFDocument();
        Document word = new WordDocument();

        pdf.print();
        word.print();
    }
}

/*
Explicación:
- Document es abstracta y obliga a implementar print().
- PDFDocument y WordDocument sobrescriben print() con su comportamiento específico.
- Polimorfismo: variables de tipo Document pueden referirse a cualquier subclase y ejecutar el método correcto.
*/
