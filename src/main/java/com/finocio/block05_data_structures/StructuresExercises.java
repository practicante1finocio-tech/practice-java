package com.finocio.block05_data_structures;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.

        int[] numbers = {2, 4, 6, 8, 10};
        System.out.println("Longitud del Array: " + numbers.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.

        System.out.println("Valor antes de modificar: " + numbers[1]);

        numbers[1] = 15;
        System.out.println("Valor después de modificar: " + numbers[1]);

        // 3. Crea un ArrayList vacío.

        ArrayList<Integer> numberList = new ArrayList<>();

        // 4. Añade 4 valores al Arraylist y elimina uno a continuación.

        numberList.add(2);
        numberList.add(7);
        numberList.add(14);
        numberList.add(11);
        System.out.println("ArrayList después de añadir 4 valores: " + numberList);

        numberList.remove(2);
        System.out.println("ArrayList después de eliminar el valor en índice 2: " + numberList);

        // 5. Crea un HashSet con 2 valores diferentes.

        HashSet<String> colourSet = new HashSet<>();
        colourSet.add("Verde");
        colourSet.add("Blanco");
        System.out.println("HashSet inicial: " + colourSet);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        colourSet.add("Blanco");
        colourSet.add("Gris");
        System.out.println("HashSet después de cambios: " + colourSet);

        // 7. Elimina uno de los elementos del HAshSet.

        colourSet.remove("Gris");
        System.out.println("HashSet después de eliminar 'Gris': " + colourSet);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Jaime", 666666666);
        contacts.put("Pepe", 777777777);
        contacts.put("Laura", 888888888);

        System.out.println("Lista de contactos: " + contacts);

        // 9. Modifica uno de los contactos y elimina otro.

        contacts.put("Pepe", 222222222);
        contacts.remove("Jaime");

        System.out.println("Lista de contactos modificada: " + contacts);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

        // Declarar y crear Array

        String[] countries = {"Suiza", "Portugal", "Francia", "España"};

        // Transformar Array en ArrayList

        ArrayList<String> countryList = new ArrayList<>(Arrays.asList(countries));
        System.out.println(countryList);

        // Transformar ArrayList en HashSet

        HashSet<String> countrySet = new HashSet<>(countryList);
        System.out.println(countrySet);

        // Transformar HashSet en un HashMap con clave y valor iguales

        HashMap<String, String> countryMap = new HashMap<>();
        for (String country : countrySet){
            countryMap.put(country, country);
        }
        System.out.println(countryMap);
    }
}
