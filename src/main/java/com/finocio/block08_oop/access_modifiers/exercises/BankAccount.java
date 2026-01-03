package com.finocio.block08_oop.access_modifiers.exercises;

/**
 * Ejercicio 3:
 * Crear una clase BankAccount con el atributo privado balance.
 * Implementar los métodos deposit(double amount) y withdraw(double amount)
 * que validen las cantidades correctamente.
 */

public class BankAccount {

    // Atributo privado: solo accesible dentro de la clase
    private double balance;

    // Constructor: inicializa el saldo de la cuenta
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;  // saldo inicial válido
        } else {
            System.out.println("Saldo inicial no válido. Se establece en 0.");
            this.balance = 0;
        }
    }

    // Getter para leer el saldo
    public double getBalance() {
        return balance;
    }

    // Método para depositar dinero, solo cantidades positivas
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depósito de " + amount + " realizado. Nuevo saldo: " + balance);
        } else {
            System.out.println("Cantidad de depósito no válida");
        }
    }

    // Método para retirar dinero, solo si hay saldo suficiente y cantidad positiva
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Retiro de " + amount + " realizado. Saldo restante: " + balance);
        } else {
            System.out.println("Cantidad de retiro no válida o saldo insuficiente");
        }
    }

    public static void main(String[] args) {

        // Crear una cuenta con saldo inicial
        BankAccount account = new BankAccount(1000);

        // Probar depósitos
        account.deposit(500);   // válido
        account.deposit(-100);  // inválido

        System.out.println("Saldo actual: " + account.getBalance());

        // Probar retiros
        account.withdraw(200);   // válido
        account.withdraw(2000);  // inválido, saldo insuficiente

        System.out.println("Saldo actual: " + account.getBalance());
    }
}
