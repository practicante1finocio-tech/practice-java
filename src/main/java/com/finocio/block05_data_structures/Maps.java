package com.finocio.block05_data_structures;

import java.util.ArrayList;
import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // Declaración y creación

        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.put("Jaico", "jaico@gmail.com");
        names.put("Jara", "jara@gmail.com");
        names.put("Marugan", "marugan@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos

        System.out.println(names.get("Jaico"));
        System.out.println(names.get("Jar"));

        // Verificar elementos

        System.out.println(names.containsKey("Jaico"));
        System.out.println(names.containsKey("Jar"));

        System.out.println(names.containsValue("jaico@gmail.com"));

        // Eliminar elementos

        System.out.println(names.remove("Jara"));
        System.out.println(names.remove("Marugan"));
        System.out.println(names);

        // Limpiar HashMap

        names.clear();
        System.out.println(names);

        // Modificación de elementos

        names.put("Jaico", "jaico@gmail.com");
        System.out.println(names);

        names.put("Jaico", "jaicomarugan@gmail.com");
        System.out.println(names);

        names.replace("Jara", "jara@gmail.com"); // Remplaza el valor si existe
        System.out.println(names);

        names.putIfAbsent("Jara", "jara@gmail.com"); // Solo lo añade si no existe
        System.out.println(names);

        // Otras operaciones

        System.out.println(names.isEmpty()); // Comprueba si esta vacío
        System.out.println(names.values()); // Imprime solo los valores
    }
}
