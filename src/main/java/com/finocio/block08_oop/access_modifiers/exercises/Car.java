package com.finocio.block08_oop.access_modifiers.exercises;

/**
 * Ejercicio 10:
 * Crear una clase Car con el atributo privado speed.
 * Agregar los métodos accelerate(int amount) y brake(int amount)
 * que ajusten la velocidad respetando los límites (0 a 120).
 */

public class Car {

    // Atributo privado
    private int speed;

    // Constructor: inicializa la velocidad
    public Car(int speed) {
        if (speed >= 0 && speed <= 120) {
            this.speed = speed;
        } else {
            System.out.println("Velocidad inicial no válida. Se establece en 0.");
            this.speed = 0;
        }
    }

    // Método para acelerar
    public void accelerate(int amount) {
        if (amount > 0) {
            speed += amount;
            if (speed > 120) {
                speed = 120;
            }
        } else {
            System.out.println("Cantidad de aceleración no válida");
        }
        System.out.println("Velocidad actual: " + speed);
    }

    // Método para frenar
    public void brake(int amount) {
        if (amount > 0) {
            speed -= amount;
            if (speed < 0) {
                speed = 0;
            }
        } else {
            System.out.println("Cantidad de frenado no válida");
        }
        System.out.println("Velocidad actual: " + speed);
    }

    // Getter para velocidad
    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {

        Car car = new Car(50);

        car.accelerate(30); // velocidad: 80
        car.accelerate(50); // velocidad: 120 (tope)
        car.brake(20);      // velocidad: 100
        car.brake(200);     // velocidad: 0 (mínimo)
    }
}
