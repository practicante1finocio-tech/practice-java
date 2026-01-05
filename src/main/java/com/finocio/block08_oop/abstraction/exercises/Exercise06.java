package com.finocio.block08_oop.abstraction.exercises;

/**
 * Ejercicio 6:
 * Crear una interfaz Movable con el método move().
 * Implementar las clases Car y Robot que tengan comportamientos diferentes al moverse.
 */

public class Exercise06 {

    public interface Movable {
        void move();
    }

    public static class Car implements Movable {
        @Override
        public void move() {
            System.out.println("El coche está conduciendo por la carretera.");
        }
    }

    public static class Robot implements Movable {
        @Override
        public void move() {
            System.out.println("El robot está caminando con sus ruedas.");
        }
    }

    public static void main(String[] args) {
        Movable car = new Car();
        Movable robot = new Robot();

        car.move();
        robot.move();
    }
}

/*
Explicación:
- Movable es una interfaz que obliga a implementar move().
- Car y Robot implementan move() con comportamientos distintos.
- Polimorfismo: las variables de tipo Movable pueden referirse a cualquier objeto que implemente la interfaz.
*/
