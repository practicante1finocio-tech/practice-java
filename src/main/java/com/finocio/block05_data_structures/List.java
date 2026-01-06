package com.finocio.block05_data_structures;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        // Declaración y creación

        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.add("Jaico");
        names.add("Jara");
        names.add("Marugán");
        System.out.println(names.size());

        // Acceder a los elementos

        System.out.println(names.get(0));
        System.out.println(names.get(names.size() - 1));

        // Modificar los elementos

        names.set(2, "jaiko@gmail.com");
        System.out.println(names.get(names.size() - 1));

        // Eliminar elementos

        names.remove(2);
        // System.out.println(names.get(2)); // Error
        System.out.println(names.size());

        //Buscar elementos

        System.out.println(names.contains("Jaico"));
        System.out.println(names.contains("jaiko@gmail.com"));;

        // Limpiar ArrayList

        names.clear();
        System.out.println(names.size());
    }
}
