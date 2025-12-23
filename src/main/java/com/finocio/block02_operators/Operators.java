package com.finocio.block02_operators;

public class Operators {

    public static void main(String[] args) {

        // Operadores

        // Aritméticos

        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b); // Módulo(%): operador que devuelve el resto de la división entre dos números

        // Asignación

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1;
        System.out.println(a);
        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        // Comparación (Relacionales)

        System.out.println(a == b);
        System.out.println(a == 0);

        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        // Lógicos

        // Y (AND)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3 > 2 && 5 == 2);

        // O (OR)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2);

        // NO (NOT)
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(3 > 2) || 5 == 2);

        // Urinarios

        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b); // Incrementa antes de imprimir
        System.out.println(b++); // Incrementa después de imprimir
        System.out.println(--b); // Decrementa antes de imprimir
        System.out.println(b--); // Decrementa después de imprimir
        System.out.println(b);

    }
}
