package com.finocio.block08_oop.abstraction.exercises;

/**
 * Ejercicio 5:
 * Crear una clase abstracta Employee con el método calculateSalary().
 * Implementar FullTimeEmployee y PartTimeEmployee con lógica diferente.
 */

public class Exercise05 {

    public static abstract class Employee {
        public abstract double calculateSalary();
    }

    public static class FullTimeEmployee extends Employee {
        double monthlySalary;

        public FullTimeEmployee(double monthlySalary) {
            this.monthlySalary = monthlySalary;
        }

        @Override
        public double calculateSalary() {
            return monthlySalary;
        }
    }

    public static class PartTimeEmployee extends Employee {
        double hourlyRate;
        int hoursWorked;

        public PartTimeEmployee(double hourlyRate, int hoursWorked) {
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculateSalary() {
            return hourlyRate * hoursWorked;
        }
    }

    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee(2000);
        Employee partTime = new PartTimeEmployee(15, 120);

        System.out.println("Salario FullTime: " + fullTime.calculateSalary());
        System.out.println("Salario PartTime: " + partTime.calculateSalary());
    }
}

/*
Explicación:
- Employee es abstracta, obliga a implementar calculateSalary().
- FullTimeEmployee devuelve salario fijo.
- PartTimeEmployee calcula según horas trabajadas.
- Polimorfismo: podemos usar variables de tipo Employee y obtener el salario correcto según subclase.
*/
