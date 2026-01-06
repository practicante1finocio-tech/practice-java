package com.finocio.block10_extras.exercises;

/**
 * Exercise08:
 * Crea una clase con comentarios adecuados explicando cada sección del código.
 */
public class Exercise08 {
    // Atributo de clase
    private String name;

    // Constructor
    public Exercise08(String name) {
        this.name = name;
    }

    // Método para mostrar nombre
    public void showName() {
        System.out.println("Nombre: " + name);
    }

    public static void main(String[] args) {
        Exercise08 obj = new Exercise08("Jaico");
        obj.showName();
    }
}
/*
Explicación:
- Comentarios explican cada sección.
- Constructor inicializa atributos.
- Método showName imprime el valor del atributo.
*/
