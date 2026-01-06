package com.finocio.block01_introduction;

public class VariablesAndConstats {

    public static void main(String[] args) {

        // Variables

        String name = "Jaico";
        System.out.println(name);

        name = "JaikoStatham";
        System.out.println(name);

        // name = 37; Error (no podemos cambiar el tipo de dato).

        int age = 37;
        System.out.println(age);

        var email = "jaico@gmail.com";
        System.out.println(email);

        var year = "jaico@gmail.com";
        System.out.println(year);

        // 'var' permite que el compilador infiera el tipo automáticamente.
        // Sin 'var' debes escribir el tipo explícitamente. El tipo siempre queda fijo.


        // Constantes

        final String EMAIL = "jaico@gmail.com";
        // EMAIL = "jaico@gmail.com"; Es constante.
        System.out.println(EMAIL);

        // En buenas prácticas, el nombre de las constantes se declara en mayúscula.

    }
}
