package com.finocio.block08_oop.polymorphism.exercises;

import java.util.ArrayList;

/**
 * Exercise 05:
 * Crea una clase Vehicle con un método start().
 * Luego crea Car, Bike y Truck que sobrescriban ese método.
 * Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
 */

public class Exercise05 {

    public static void main(String[] args) {

        // Lista polimórfica: acepta cualquier Vehicle
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());

        // Polimorfismo en acción
        for (Vehicle vehicle : vehicles) {
            vehicle.start(); // se ejecuta la versión correcta en tiempo de ejecución
        }
    }

    // Clase base
    public static class Vehicle {

        public void start() {
            System.out.println("The vehicle is starting");
        }
    }

    // Subclase Car
    public static class Car extends Vehicle {

        @Override
        public void start() {
            System.out.println("The car engine starts");
        }
    }

    // Subclase Bike
    public static class Bike extends Vehicle {

        @Override
        public void start() {
            System.out.println("The bike starts pedaling");
        }
    }

    // Subclase Truck
    public static class Truck extends Vehicle {

        @Override
        public void start() {
            System.out.println("The truck engine roars to life");
        }
    }
}
