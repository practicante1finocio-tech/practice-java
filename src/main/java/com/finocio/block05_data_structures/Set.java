package com.finocio.block05_data_structures;

import java.util.HashSet;

public class Set {

    public static void main(String[] args) {

        // Declaración y creación

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.add("Jaico");
        names.add("Jara");
        names.add("Marugán");
        names.add("jaiko@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Eliminar elementos

        names.remove("Jaico");
        System.out.println(names.size());

        //Buscar elementos

        System.out.println(names.contains("Jaico"));
        System.out.println(names.contains("jaiko@gmail.com"));;

        System.out.println(names);
        names.add("Jara");
        names.add("Jara");
        names.add("Jara");
        System.out.println(names);

        // Conjuntos

        // names.addAll(numbers); // Error

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("Francia");
        countries.add("Argentina");
        countries.add("Marugán");

        names.addAll(countries);

        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);
    }
}
