package com.finocio.block10_extras.exercises;

/**
 * Exercise10:
 * Haz debug del código implementado haciendo uso de sus diferentes herramientas.
 */
public class Exercise10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        // Ejemplo de debug: verificar valores antes de operación
        System.out.println("Valor de a: " + a + ", b: " + b);

        try {
            int c = a / b; // Esto genera ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error detectado: " + e);
        }
    }
}
/*
Explicación:
- Podemos usar prints para rastrear valores (debug simple).
- También podemos usar breakpoints y herramientas del IDE.
- try-catch permite capturar errores y analizarlos.
*/
