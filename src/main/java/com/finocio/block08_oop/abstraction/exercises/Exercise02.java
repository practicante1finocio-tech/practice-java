package com.finocio.block08_oop.abstraction.exercises;

/**
 * Ejercicio 2:
 * Crear una interfaz Playable con el método play().
 * Implementar esa interfaz en Guitar y Piano.
 * Cada una debe mostrar un mensaje diferente al ejecutarse.
 */

public class Exercise02 {

    public interface Playable {
        void play();
    }

    public static class Guitar implements Playable {
        @Override
        public void play() {
            System.out.println("La guitarra está sonando: Taa-daa!");
        }
    }

    public static class Piano implements Playable {
        @Override
        public void play() {
            System.out.println("El piano está sonando: Plim-plim!");
        }
    }

    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play();
        piano.play();
    }
}

/*
Explicación:
- Playable es una interfaz: solo define el contrato (método play()).
- Guitar y Piano implementan play() con comportamiento propio.
- Permite polimorfismo: podemos declarar variables de tipo Playable y asignar cualquier clase que implemente la interfaz.
*/
