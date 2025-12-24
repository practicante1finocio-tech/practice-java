package com.finocio.block03_strings;

public class Strings {

    public static void main(String[] args) {

        // Declaración

        String name = "Jaico";
        var surname = new String("Jara");

        // Operaciones básicas

        // Concatenación
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener carácter
        System.out.println(name.charAt(name.length() - 1)); // Ultimo carácter
        System.out.println(name.charAt(2));

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Jaico"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Comparación
        System.out.println(name.equals("Jaico"));
        System.out.println(name.equals("jaico"));
        System.out.println(name.equalsIgnoreCase("jaico"));

        // == vs. equals

        var a = "Jaico";
        var b = "Jaico";
        var c = new String("Jaico");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // Trim
        System.out.println(" Hola, me llamo Jaico ".trim());

        // Replace
        System.out.println(" Hola, me llamo Jaico ".replace(" ", ""));

        System.out.println(" Hola, me llamo Jaico ".trim().replace("Jaico", "Jaiko"));

        //  Format
        var age = 34;
        System.out.println(String.format("Hola, soy %s. Tengo %d años.", name, age));
            // %s para strings, %d para números enteros y %f para números decimales.

    }
}
