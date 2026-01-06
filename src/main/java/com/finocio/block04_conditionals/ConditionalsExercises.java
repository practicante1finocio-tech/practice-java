package com.finocio.block04_conditionals;

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).

        {
            var userAge = 17;

            if (userAge >= 18) {
                System.out.println("El usuario puede votar.");
            } else {
                System.out.println("El usuario no puede votar.");
            }
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        {
            var firstNumber = 6;
            var secondNumber = 5;

            if (firstNumber > secondNumber) {
                System.out.println("El número mayor es: " + firstNumber);
            } else if (firstNumber == secondNumber) {
                System.out.println("Los dos números son iguales");
            } else {
                System.out.println("El número mayor es: " + secondNumber);
            }
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        {
            var number = -2;

            if (number > 0) {
                System.out.println("El número es positivo");
            } else if (number == 0) {
                System.out.println("El número es cero");
            } else {
                System.out.println("El número es negativo");
            }
        }

        // 4. Crea un programa que diga si un número es par o impar.

        {
            var number = 2;

            if (number % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        {
            var number = 150;

            if (number >= 1 && number <= 100){
                System.out.println("El número esta dentro del rango de 1 a 100.");
            } else {
                System.out.println("El número esta fuera del rango de 1 a 100.");
            }
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con un switch.

        {
            var dayNumber = 5;

            switch (dayNumber){
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Número de día de la semana inválido.");
            }
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        {
            var systemNotes = 50;

            if (systemNotes >= 90 && systemNotes <= 100){
                System.out.println("Sobresaliente");
            }else if (systemNotes >= 50 && systemNotes < 90){
                System.out.println("Aprobado");
            }else if (systemNotes >= 0 && systemNotes < 50){
                System.out.println("Suspenso");
            }else {
                System.out.println("Nota inválida");
            }
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        {
            var ageClient = 13;
            var isAccompanied = true;

            if (ageClient >= 15 || isAccompanied){
                System.out.println("Puede entrar al cine.");
            } else {
                System.out.println("No puede entrar al cine.");
            }
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante (char).

        {
            var letter = 'Z';
            letter = Character.toLowerCase(letter); // Convertir a minúsculas

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("Es una vocal.");
            } else {
            System.out.println("Es una consonante.");
            }
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        {
            var a = 2;
            var b = 6;
            var c = 8;

            if (a > b && a > c){
                System.out.println("La mayor de las tres variables es: "+a);
            } else if (b > a && b > c) {
                System.out.println("La mayor de las tres variables es: "+b);
            }else {
                System.out.println("La mayor de las tres variables es: "+c);
            }
        }
    }
}
