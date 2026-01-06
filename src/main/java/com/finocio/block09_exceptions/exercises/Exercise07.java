package com.finocio.block09_exceptions.exercises;

/**
 * Ejercicio 7:
 * Crea una clase TemperatureChecker que lanza una excepción personalizada
 * si la temperatura es menor a -50 o mayor a 50.
 */
public class Exercise07 {

    public static class TemperatureChecker {
        public void checkTemperature(double temp) throws TemperatureException {
            if (temp < -50 || temp > 50) {
                throw new TemperatureException("Temperatura fuera de rango: " + temp);
            } else {
                System.out.println("Temperatura válida: " + temp);
            }
        }
    }

    public static class TemperatureException extends Exception {
        public TemperatureException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        TemperatureChecker checker = new TemperatureChecker();
        try {
            checker.checkTemperature(60);
        } catch (TemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
