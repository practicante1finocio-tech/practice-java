package com.finocio.block08_oop.classes_and_objects.exercises;

// Ejercicio 6
// Crear una clase BankAccount con un atributo balance.
// Añadir un método deposit(double amount) que incremente el saldo.

public class BankAccount {

    double balance;

    // Constructor: inicializa el saldo de la cuenta al crear el objeto
    public BankAccount (double initialBalance) {
        this.balance = initialBalance;
    }

    // Método para depositar dinero en la cuenta
    public void deposit (double amount) {
        balance += amount;
        System.out.println("Se ha depositado " + amount + ". Nuevo saldo: " + balance);
    }

    public static void main(String[] args) {

        // Crear un objeto BankAccount con saldo inicial de 1000
        BankAccount myAccount = new BankAccount(1000);

        // Depositar 500 en la cuenta
        myAccount.deposit(500);
    }
}
