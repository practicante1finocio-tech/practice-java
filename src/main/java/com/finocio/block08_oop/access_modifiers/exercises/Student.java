package com.finocio.block08_oop.access_modifiers.exercises;

/**
 * Ejercicio 9:
 * Crear una clase Student con el atributo privado grade.
 * Agregar los métodos setGrade(int grade) e isPassed() que retorne true si la nota es >= 60.
 */

public class Student {

    // Atributo privado
    private int grade;

    // Constructor
    public Student(int grade) {
        setGrade(grade); // usamos el setter para validación
    }

    // Setter con validación de nota
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Nota inválida. Debe estar entre 0 y 100.");
            this.grade = 0; // valor por defecto
        }
    }

    // Método que indica si el estudiante aprueba
    public boolean isPassed() {
        return grade >= 60;
    }

    public static void main(String[] args) {

        Student student1 = new Student(75);
        System.out.println("Aprobado? " + student1.isPassed()); // true

        Student student2 = new Student(50);
        System.out.println("Aprobado? " + student2.isPassed()); // false

        Student student3 = new Student(150); // prueba nota inválida
        System.out.println("Aprobado? " + student3.isPassed()); // false
    }
}
