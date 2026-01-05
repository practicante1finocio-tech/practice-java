package com.finocio.block08_oop.inheritance.exercises;

/**
 * Ejercicio 07:
 * Haz una clase Device con un constructor que imprima "Device created".
 * Luego crea Phone que herede de Device y en su constructor imprima "Phone ready".
 */

public class Exercise07 {

    public static void main(String[] args) {

        // Crear un dispositivo genérico
        Device device = new Device();

        // Crear un teléfono
        Phone phone = new Phone();
    }

    // Clase base Device
    public static class Device {

        public Device() {
            System.out.println("Device created");
        }
    }

    // Subclase Phone que hereda de Device
    public static class Phone extends Device {

        public Phone() {
            super(); // Llamada al constructor de Device
            System.out.println("Phone ready");
        }
    }
}
