package com.finocio.block09_exceptions.exercises;

/**
 * Ejercicio 10:
 * Implementa una clase LoginSystem que use una excepción personalizada
 * LoginFailedException si el usuario o contraseña son incorrectos.
 */
public class Exercise10 {

    public static class LoginSystem {
        private String username = "admin";
        private String password = "123456";

        public void login(String user, String pass) throws LoginFailedException {
            if (!username.equals(user) || !password.equals(pass)) {
                throw new LoginFailedException("Usuario o contraseña incorrectos");
            } else {
                System.out.println("Login exitoso");
            }
        }
    }

    public static class LoginFailedException extends Exception {
        public LoginFailedException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        LoginSystem system = new LoginSystem();
        try {
            system.login("admin", "wrongpass");
        } catch (LoginFailedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
