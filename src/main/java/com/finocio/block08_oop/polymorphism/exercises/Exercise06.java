package com.finocio.block08_oop.polymorphism.exercises;

/**
 * Exercise 06:
 * Crea una clase Notification con método send().
 * Crea subclases EmailNotification y SMSNotification.
 * Luego crea una función sendNotification(Notification n)
 * que reciba cualquier tipo y ejecute send().
 */

public class Exercise06 {

    public static void main(String[] args) {

        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        sendNotification(email);
        sendNotification(sms);
    }

    // MÉTODO CLAVE DEL EJERCICIO
    public static void sendNotification(Notification notification) {
        notification.send(); // polimorfismo en tiempo de ejecución
    }

    // Clase base
    public static class Notification {

        public void send() {
            System.out.println("Sending a generic notification");
        }
    }

    // Subclase Email
    public static class EmailNotification extends Notification {

        @Override
        public void send() {
            System.out.println("Sending an EMAIL notification");
        }
    }

    // Subclase SMS
    public static class SMSNotification extends Notification {

        @Override
        public void send() {
            System.out.println("Sending an SMS notification");
        }
    }
}

