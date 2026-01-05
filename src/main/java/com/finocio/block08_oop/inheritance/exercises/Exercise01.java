package com.finocio.block08_oop.inheritance.exercises;

/**
 * Ejercicio 01:
 * Crea una clase Vehicle con un método move().
 * Luego crea una subclase Car que herede de Vehicle y agregue el método honk().
 */

public class Exercise01 {

    public static void main(String[] args) {

        // Crear un objeto Vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.move();

        // Crear un objeto Car
        Car car = new Car();
        car.move();  // Método heredado de Vehicle
        car.honk();  // Método propio de Car
    }

    // Clase padre
    public static class Vehicle {

        public void move() {
            System.out.println("The vehicle is moving");
        }
    }

    // Clase hija
    public static class Car extends Vehicle {

        public void honk() {
            System.out.println("Beep beep!");
        }
    }
}
