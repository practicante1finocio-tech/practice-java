package com.finocio.block01_introduction;

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.

            // Tipo explícito (emplearla para variables simples)

        String name = "Jaico";
        System.out.println("Nombre: " + name);

        /*
            // Usando var (para tipos largos o expresiones complicadas)

               var name2 = "Jaico";
               System.out.println(name2);
         */

        // 2. Crear una variable de tipo int y asígnale tu edad.

        int age = 34;
        System.out.println("Edad: " + age);

        // 3. Crea una variable double con tu altura en metros.

        double height = 1.81;
        System.out.println("Altura: " + height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.

        boolean programar = true;
        System.out.println("¿Me gusta programar?: " + programar);

        // 5. Declara una constante con tu email.

        final String EMAIL = "jaiko@gmail.com";
        System.out.println("Mi email es: " + EMAIL); // Variables en minúscula; constantes en mayúscula (EMAIL)

        // 6. Crea una variable de tipo char y guárdale tu inicial.

        char inicial = 'J';
        System.out.println("Mi inicial es: " + inicial);

        // 7. Declara una variable de tipo String con tu localidad y a continuación cambia su valor y vuelve a imprimirla.

        String localidad = "La Adrada";
        System.out.println("Mi localidad es: " + localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.

        int a = 3;
        int b = 5;
        System.out.println("La suma de a + b es: " + (a + b));

        // 9. Imprime el tipo de dos variables creadas anteriormente.

        System.out.println("Tipo de programar: " + ((Object) programar).getClass().getSimpleName()); // Para imprimir el tipo: los primitivos se convierten a Object.
        System.out.println("Tipo de name: " + name.getClass().getSimpleName()); // Las variables de referencia (como String) no necesitan conversión.

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.

        int numero;     // Declarar sin valor.
        numero = 10;    // Asignar valor antes de usarla.
        System.out.println("Número: " + numero);

        String saludo;
        saludo = "Hola";
        System.out.println("Saludo: " + saludo);

    }
}
