package com.finocio.block06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        System.out.println("\n=== Ejercicio 1 ===");

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        System.out.println("\n=== Ejercicio 2 ===");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int j = 0;

        do {
            System.out.println(numbers.get(j));
            j ++;
        } while (j < numbers.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        System.out.println("\n=== Ejercicio 3 ===");

        for (int k = 1; k <= 10 ; k++) {
            System.out.println(5 * k);
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        System.out.println("\n=== Ejercicio 4 ===");

        int[] numbersArray = {1,2,3,4,5};

        int suma = 0;

        for (int l = 0; l < numbersArray.length; l++) {
            suma += numbersArray[l];
        }
        System.out.println(suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        System.out.println("\n=== Ejercicio 5 ===");

        for (int m = 0; m < numbersArray.length; m++) {
            System.out.println(numbersArray[m]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        System.out.println("\n=== Ejercicio 6 ===");

        HashSet<String> countries = new HashSet<>();
        countries.add("España");
        countries.add("Francia");
        countries.add("Alemania");

        for (String country: countries) {
            System.out.println(country);
        }

        HashMap<String, String> colours = new HashMap<>();
        colours.put("Rojo", "Red");
        colours.put("Verde", "Green");
        colours.put("Negro", "Noir");

        for (Map.Entry<String, String> colour: colours.entrySet()){
            System.out.println(colour.getKey() + "-" + colour.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendente) con un bucle for.
        System.out.println("\n=== Ejercicio 7 ===");

        for (int n = 10; n > 0; n--) {
            System.out.println(n);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        System.out.println("\n=== Ejercicio 8 ===");

        for (int x = 1; x <= 20; x++) {
            if (x % 3 == 0) {
                continue;
            }
            System.out.println(x);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un Array.
        System.out.println("\n=== Ejercicio 9 ===");

        int[] numerosArray = {2,4,6,9,-11,20};

        for (int t: numerosArray){
            if (t < 0){
                break;
            }
            System.out.println(t);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        System.out.println("\n=== Ejercicio 10 ===");

        int number = 5; // Número del que queremos calcular el factorial
        int factorial = 1; // Variable para almacenar el resultado del factorial

        // Bucle for usando 'y' como variable de control
        for (int y = 1; y <= number; y++) {
            factorial *= y; // Multiplicamos el valor actual de factorial por y
            // Equivalente a: factorial = factorial * y
        }

        // Después del bucle, factorial contiene el resultado final
        System.out.println("Factorial de " + number + " = " + factorial);
    }
}
