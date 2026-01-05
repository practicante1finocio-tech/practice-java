package com.finocio.block08_oop.abstraction.exercises;

/**
 * Ejercicio 7:
 * Crear una clase abstracta Appliance con métodos turnOn() y turnOff().
 * Implementar TV y WashingMachine con mensajes diferentes al encender y apagar.
 */

public class Exercise07 {

    public static abstract class Appliance {
        public abstract void turnOn();
        public abstract void turnOff();
    }

    public static class TV extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("El televisor se ha encendido.");
        }

        @Override
        public void turnOff() {
            System.out.println("El televisor se ha apagado.");
        }
    }

    public static class WashingMachine extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("La lavadora está en funcionamiento.");
        }

        @Override
        public void turnOff() {
            System.out.println("La lavadora se ha apagado.");
        }
    }

    public static void main(String[] args) {
        Appliance tv = new TV();
        Appliance washer = new WashingMachine();

        tv.turnOn();
        tv.turnOff();

        washer.turnOn();
        washer.turnOff();
    }
}

/*
Explicación:
- Appliance es abstracta y obliga a implementar turnOn() y turnOff().
- TV y WashingMachine proporcionan sus propios mensajes al encender/apagar.
- Polimorfismo: podemos usar variables del tipo Appliance y llamar a los métodos correctos según la subclase.
*/
