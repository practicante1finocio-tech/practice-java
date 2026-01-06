package com.finocio.block08_oop.access_modifiers.exercises;

/**
 * Ejercicio 5:
 * Crear una clase Temperature con el atributo privado celsius.
 * El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
 */

public class Temperature {

    // Atributo privado: solo accesible dentro de la clase
    private double celsius;

    // Constructor: inicializa la temperatura usando el setter para validar
    public Temperature(double celsius) {
        setCelsius(celsius); // garantiza que el valor inicial sea válido
    }

    // Getter: permite leer el valor de celsius
    public double getCelsius() {
        return celsius;
    }

    // Setter: valida que la temperatura esté entre -100 y 100
    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
        } else {
            System.out.println("Temperatura no válida. Debe estar entre -100 y 100.");
        }
    }

    public static void main(String[] args) {

        // Crear un objeto Temperature con un valor válido
        Temperature temp = new Temperature(25);
        System.out.println("Temperatura inicial: " + temp.getCelsius() + "°C");

        // Intentar asignar un valor inválido
        temp.setCelsius(200); // Mensaje de error
        System.out.println("Temperatura después de intento inválido: " + temp.getCelsius() + "°C");

        // Asignar un valor válido
        temp.setCelsius(-10);
        System.out.println("Temperatura actualizada: " + temp.getCelsius() + "°C");
    }
}
