package com.finocio.block08_oop.inheritance.exercises;

/**
 * Ejercicio 08:
 * Account tiene un saldo y métodos para deposit() y withdraw().
 * SavingsAccount hereda de Account y agrega un método addInterest() que aumenta el saldo con un interés.
 */

public class Exercise08 {

    public static void main(String[] args) {

        // Crear una cuenta normal
        Account account = new Account(1000);
        account.deposit(500);
        account.withdraw(200);

        System.out.println("Saldo de la cuenta normal: " + account.getBalance());

        // Crear una cuenta de ahorros
        SavingsAccount savings = new SavingsAccount(2000);
        savings.deposit(500);
        savings.withdraw(300);
        savings.addInterest(5); // Añadir 5% de interés

        System.out.println("Saldo de la cuenta de ahorros: " + savings.getBalance());
    }

    // Clase base Account
    public static class Account {

        private double balance;

        public Account(double initialBalance) {
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                this.balance = 0;
                System.out.println("Saldo inicial no válido. Se establece en 0.");
            }
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Depósito: " + amount + ". Saldo actual: " + balance);
            } else {
                System.out.println("Cantidad de depósito no válida");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Retiro: " + amount + ". Saldo actual: " + balance);
            } else {
                System.out.println("Cantidad de retiro no válida o saldo insuficiente");
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    // Subclase SavingsAccount que hereda de Account
    public static class SavingsAccount extends Account {

        public SavingsAccount(double initialBalance) {
            super(initialBalance);
        }

        // Método para añadir interés al saldo
        public void addInterest(double percent) {
            if (percent > 0) {
                double interest = getBalance() * percent / 100;
                deposit(interest); // reutiliza el método deposit
                System.out.println("Se añadió interés del " + percent + "%: " + interest);
            } else {
                System.out.println("Porcentaje de interés no válido");
            }
        }
    }
}
