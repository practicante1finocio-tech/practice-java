package com.finocio.block03_strings;

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.

        String name = "Jaico";
        String surname = "Jara";

        System.out.println(name + " " + surname);

        // 2. Muestra la longitud de una cadena de texto.

        String distance = "Es una frase para calcular su longitud.";
        System.out.println(distance.length());

        // 3. Muestra el primer y último carácter de un string.

        System.out.println("" + name.charAt(0) + name.charAt(name.length() - 1));

        // Usar"" para forzar la concatenación de caracteres como texto.
        // Sin el String vacío, Java suma los valores numéricos de los char.

        // 4. Convierte a mayúsculas y minúsculas un string.

        System.out.println("Minúsculas".toLowerCase());
        System.out.println("Mayúsculas".toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        System.out.println(distance.contains("frase"));
        System.out.println(distance.contains("Pepe"));

        // 6. Formatea un string con un entero.

        int age = 34;
        System.out.println(String.format("Mi nombre es %s y mi edad es %d años.", name, age));

        // 7. Elimina los espacios en blanco al principio y al final de un string.

        String text = " Esta frase contiene espacios al principio y al final ";
        System.out.println(text);
        System.out.println(text.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).

        System.out.println(text.trim().replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.

        System.out.println(name.equals(surname));
        System.out.println(name.equals("jaico"));
        System.out.println(name.equalsIgnoreCase("jaico"));

        // 10. Comprueba si dos strings tienen la misma longitud.

        System.out.println(name.length() == surname.length());
        System.out.println(name.length() == "Jaime".length());

    }
}
