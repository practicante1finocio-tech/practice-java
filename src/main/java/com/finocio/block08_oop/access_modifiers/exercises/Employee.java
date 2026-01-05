package com.finocio.block08_oop.access_modifiers.exercises;

/**
 * Ejercicio 7:
 * Crear una clase Employee con el atributo privado salary.
 * Agregar un método raiseSalary(double percent) que solo permita aumentos positivos.
 */

public class Employee {

    // Atributo privado: solo accesible dentro de la clase
    private double salary;

    // Constructor: inicializa el salario
    public Employee(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salario no válido. Se establece en 0.");
            this.salary = 0;
        }
    }

    // Getter para leer el salario
    public double getSalary() {
        return salary;
    }

    // Método para aumentar salario, solo si el porcentaje es positivo
    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
            System.out.println("El salario se ha aumentado un " + percent + "%. Nuevo salario: " + salary);
        } else {
            System.out.println("El aumento debe ser positivo");
        }
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(1500);

        // Aumentos válidos
        emp1.raiseSalary(10); // aumenta 10%
        emp1.raiseSalary(-5); // inválido

        // Mostrar salario final
        System.out.println("Salario final: " + emp1.getSalary());
    }
}
