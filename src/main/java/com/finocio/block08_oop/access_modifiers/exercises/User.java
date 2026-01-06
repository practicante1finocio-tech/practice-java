package com.finocio.block08_oop.access_modifiers.exercises;

/**
 * Ejercicio 6:
 * Crear una clase User con los atributos privados username y password.
 * Implementar métodos para asignar valores y comprobar la contraseña.
 */

public class User {

    // Atributos privados: protegidos
    private String username;
    private String password;

    // Constructor: inicializa usuario y contraseña
    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    // Setter para el nombre de usuario
    public void setUsername(String username) {
        if (username != null && !username.isEmpty()) {
            this.username = username;
        } else {
            System.out.println("Nombre de usuario no válido");
        }
    }

    // Setter para la contraseña
    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
        } else {
            System.out.println("La contraseña debe tener al menos 6 caracteres");
        }
    }

    // Método para comprobar si la contraseña es correcta
    public boolean checkPassword(String inputPassword) {
        if (password == null) {
            return false;
        }
        return password.equals(inputPassword);
    }

    public static void main(String[] args) {

        // Crear usuario
        User user = new User("Jaico", "12345");

        // Comprobar contraseñas
        System.out.println(user.checkPassword("12346")); // true
        System.out.println(user.checkPassword("password")); // false

        // Crear usuario con contraseña válida
        User user2 = new User("Ana", "abcdef"); // válida
        System.out.println(user2.checkPassword("abcdef")); // true
        System.out.println(user2.checkPassword("abc123")); // false
    }
}
