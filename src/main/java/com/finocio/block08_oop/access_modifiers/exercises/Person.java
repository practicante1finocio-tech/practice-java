package com.finocio.block08_oop.access_modifiers.exercises;

/**
 * Ejercicio 1:
 * Crear una clase Person con atributos privados name y age.
 * Usar los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
 */

public class Person {

    // Atributos privados: solo accesibles dentro de esta clase
    private String name;
    private int age;

    // Constructor: inicializa los atributos al crear el objeto
    public Person ( String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter para el nombre: permite leer el atributo privado
    public String getName () {
        return name;
    }

    // Setter para el nombre: permite modificar el atributo privado
    public void setName (String name) {
        this.name = name;
    }

    // Getter para la edad
    public int getAge () {
        return age;
    }

    // Setter para la edad con validación mínima
    public void setAge (int age) {
        if (age > 0) {            // no permitimos edades negativas
            this.age = age;
        } else {
            System.out.println("Edad no valida");
        }
    }

    public static void main(String[] args) {

        // Crear un objeto Person usando el constructor
        Person person = new Person("Jaico", 34);

        // Leer los atributos usando getters
        System.out.println("Nombre: " + person.getName());
        System.out.println("Edad: " + person.getAge());

        // Modificar atributos usando setters
        person.setName("Jara");
        person.setAge(40);

        // Volver a mostrar los valores actualizados
        System.out.println("Nombre: " + person.getName());
        System.out.println("Edad: " + person.getAge());
    }
}
