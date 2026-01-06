package com.finocio.block08_oop.inheritance.exercises;

/**
 * Ejercicio 04:
 * La clase Employee tiene los atributos name y salary.
 * Manager hereda de Employee y agrega el atributo department.
 */

public class Exercise04 {

    public static void main(String[] args) {

        // Crear un empleado
        Employee emp = new Employee("Jaico", 2000);
        emp.showInfo();

        // Crear un manager
        Manager mgr = new Manager("Ana", 4000, "IT");
        mgr.showInfo();
    }

    // Clase base Employee
    public static class Employee {

        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public void showInfo() {
            System.out.println("Employee: " + name + ", Salary: " + salary);
        }
    }

    // Clase derivada Manager
    public static class Manager extends Employee {

        String department;

        public Manager(String name, double salary, String department) {
            super(name, salary);  // Llamada al constructor de Employee
            this.department = department;
        }

        @Override
        public void showInfo() {
            System.out.println("Manager: " + name + ", Salary: " + salary + ", Department: " + department);
        }
    }
}
