package com.finocio.block10_extras.exercises;

import java.util.Random;

/**
 * Exercise07:
 * Importa java.util.Random y genera un número aleatorio del 1 al 10.
 */
public class Exercise07 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10) + 1; // 0-9 +1 = 1-10
        System.out.println("Número aleatorio: " + num);
    }
}
/*
Explicación:
- Random.nextInt(n) genera 0 a n-1.
- Sumamos 1 para que vaya de 1 a 10.
*/
