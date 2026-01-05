package com.finocio.block08_oop.classes_and_objects.exercises;

// Ejercicio 8
// Crear una clase Worker con los atributos name y salary.
// Añadir un método que muestre el salario del trabajador.

public class Worker {

    String name;
    double salary;

    public Worker (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println("El salario de " + name + " es: " + salary);
    }

    public static void main(String[] args) {

        Worker worker = new Worker("Jaico", 1500);
        worker.showSalary();
    }
}
