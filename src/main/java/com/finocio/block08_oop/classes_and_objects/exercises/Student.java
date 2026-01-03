package com.finocio.block08_oop.classes_and_objects.exercises;

// Ejercicio 5
// Crear una clase Student con un atributo score.
// Añadir un método que indique si el estudiante aprueba
// (score mayor o igual a 60).

public class Student {

    int score;

    public Student (int score) {
        this.score = score;
    }

    public void isPassed () {
        if (score >= 60) {
            System.out.println("El estudiante ha aprobado con:" + score);
        } else {
            System.out.println("El estudiante ha suspendido con: " + score);
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student(70);
        student1.isPassed();
        Student student2 = new Student(50);
        student2.isPassed();
    }
}
