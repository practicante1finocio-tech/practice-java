package com.finocio.block08_oop.inheritance.exercises;

/**
 * Ejercicio 09:
 * Crea una clase Vehicle y tres subclases: Car, Bike y Truck.
 * Cada subclase sobrescribe el método describe() para mostrar información específica.
 */

public class Exercise09 {

    public static void main(String[] args) {

        // Crear objetos de cada tipo de vehículo
        Vehicle genericVehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();

        // Llamar al método describe() de cada objeto
        genericVehicle.describe();
        car.describe();
        bike.describe();
        truck.describe();
    }

    // Clase base Vehicle
    public static class Vehicle {
        public void describe() {
            System.out.println("Soy un vehículo genérico");
        }
    }

    // Subclase Car
    public static class Car extends Vehicle {
        @Override
        public void describe() {
            System.out.println("Soy un coche y puedo transportar personas cómodamente");
        }
    }

    // Subclase Bike
    public static class Bike extends Vehicle {
        @Override
        public void describe() {
            System.out.println("Soy una bicicleta y soy ecológica y rápida en ciudad");
        }
    }

    // Subclase Truck
    public static class Truck extends Vehicle {
        @Override
        public void describe() {
            System.out.println("Soy un camión y puedo transportar cargas pesadas");
        }
    }
}
