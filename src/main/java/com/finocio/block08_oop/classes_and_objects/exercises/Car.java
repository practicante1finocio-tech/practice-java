package com.finocio.block08_oop.classes_and_objects.exercises;

// Ejercicio 4
// Crear una clase Car con los atributos brand y model.
// Añadir un método showData() que muestre la información del coche.

public class Car {

    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showData() {
        System.out.println("Mi coche es un " + brand + " " + model);
    }

    public static void main(String[] args) {

        Car myCar = new Car("Audi", " A3");
        myCar.showData();
    }
}
