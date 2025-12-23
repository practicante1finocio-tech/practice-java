package com.finocio.block02_operators;

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.

        int suma = 10 + 5;
        int resta = 10 - 5;
        int multiplicacion = 10 * 5;
        int division = 10 / 5;
        int modulo = 10 % 3;

        // 2. Crea una variable para cada tipo de operación de asignación.

        int c = 10;

        c += 5;
        c -= 2;
        c *= 2;
        c /= 2;
        c %= 3;

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(5 == 5);
        System.out.println(5 > 4);
        System.out.println(7 <= 12);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(6 != 6);
        System.out.println(3 < 2 );
        System.out.println(6 >= 8);

        // 5. Utiliza el operador lógico and.

        System.out.println(5>3 && 7<8);

        // 6. Utiliza el operador lógico or.

        System.out.println(6 >= 7 || 5 < 4);

        // 7. Combina ambos operadores lógicos.

        System.out.println((5>3 && 7<8) || true);

        // 8. Añade alguna negación.

        System.out.println(!false);
        System.out.println(5 != 4);

        // 9. Imprime 3 ejemplos de uso de operaciones urinarios.

        int e = 5;

        System.out.println(e++);
        System.out.println(-e);
        System.out.println(++e);

        // 10. Combina operadores aritméticos de comparación y lógicos.

        System.out.println((5 + 3 > 4) && (3 * 2 != 5) );
        System.out.println((9 - 4 < 4) || (4 / 2 >= 4));

    }
}
