package com.finocio.block06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {

    public static void main(String[] args) {

        // Loops

        // -for controlado por contador

        for (int index = 0; index < 5; index++) {
            System.out.println("Hola, Java!");
        }

        String[] names = {"Jaico", "Jara", "Marugan", "jaico@gmail.com", "Statham"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

        // for-each

        for (String name: names){
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number: numbers) {
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Jaico", "jaico@gmail.com");
        emails.put("Jara", "jara@gmail.com");
        emails.put("Marugan", "marugan@gmail.com");

        for (Map.Entry<String, String> email: emails.entrySet()) {
            System.out.println(email); // Par clave - valor
            System.out.println(email.getKey()); // Solo la clave
            System.out.println(email.getValue()); // Solo el valor
        }

        // - while

        int index = 0;
        while (index < 5) {
            System.out.println("Hola, Java!");
            index++;
        }

        index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++;
        }

        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("Jara")) {
                find = true;
            }
            index++;
        }

        // - do-while

        do {
            System.out.println("Hola, Java!");
            index++;
        }while (index < 0);

        // Control de bucles

        // - break

        for (String name: names) {
            if (name.equals("Jara")) {
                break;
            }
            System.out.println(name);
        }

        // - continue (fuerza la siguiente ejecución del bucle)

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
