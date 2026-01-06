package com.finocio.block01_introduction;

import java.sql.SQLOutput;

public class HelloWordExercises {


    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".

        System.out.println("Hola Jaico!");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo printl.

        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.

        // 4. Crea un comentario en varias líneas.

            /*
            Esto es un comentario
            en carias líneas
            para el ejercicio.
             */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.

        System.out.println("Mi edad es 47, mi color favorito es el gris y mi ciudad es Murcia.");

        // 6. Explora los diferentes System.XXX.println(); más alla de "out".

        // 7. Utiliza varios println para imprimir una frase.

        System.out.println("Esto es una frase");
        System.out.println("en varias líneas");
        System.out.println("para este ejercicio");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

        System.out.println(

                "  *****  \n" +
                        " *     * \n" +
                        "*  O O  *\n" +
                        "*   ^   *\n" +
                        "*  '-'  *\n" +
                        " *     * \n" +
                        "  *****  "

                // Se usan "\n" para saltos de línea dentro de la cadena.
                // El operador "+" concatena todas las líneas en una sola cadena.
        );

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        // 10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo.

    }
}
