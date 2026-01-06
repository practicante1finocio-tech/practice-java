package com.finocio.block08_oop.abstraction.exercises;

/**
 * Ejercicio 10:
 * Crear una interfaz Payable con el método pay().
 * Implementar Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
 */

public class Exercise10 {

    public interface Payable {
        void pay();
    }

    public static class Invoice implements Payable {
        @Override
        public void pay() {
            System.out.println("Factura pagada con tarjeta.");
        }
    }

    public static class EmployeePayment implements Payable {
        @Override
        public void pay() {
            System.out.println("Pago al empleado mediante transferencia.");
        }
    }

    public static void main(String[] args) {
        Payable invoice = new Invoice();
        Payable employee = new EmployeePayment();

        invoice.pay();
        employee.pay();
    }
}

/*
Explicación:
- Payable es una interfaz que obliga a implementar pay().
- Invoice y EmployeePayment proporcionan implementaciones diferentes.
- Polimorfismo: podemos usar variables de tipo Payable y ejecutar el método correspondiente de cada clase.
*/
