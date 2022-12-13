package org.Ejercicios.ejercicio2tema3;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona("Juan","Munoz", "Garcia");
        Persona persona4 = new Persona("Antonio","Gomez","Rujano", 5);

        System.out.println("Persona 1");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("1º Apellido: " + persona1.getPrimerApellido());
        System.out.println("2º Apellido: " + persona1.getSegundoApellido());
        persona1.calculoEdad();
        System.out.println("Edad: " + persona1.getEdad());


        System.out.println("Persona 2");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("1º Apellido: " + persona2.getPrimerApellido());
        System.out.println("2º Apellido: " + persona2.getSegundoApellido());
        persona2.calculoEdad();
        System.out.println("Edad: " + persona2.getEdad());


        /**System.out.println("Persona3");
        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("1º Apellido: " + persona3.getPrimerApellido());
        System.out.println("2º Apellido: " + persona3.getSegundoApellido());
        persona3.calculoEdad();
        System.out.println("Edad: " + persona3.getEdad());

        System.out.println("Persona 4");
        System.out.println("Nombre: " + persona4.getNombre());
        System.out.println("1º Apellido: " + persona4.getPrimerApellido());
        System.out.println("2º Apellido: " + persona4.getSegundoApellido());
        persona4.calculoEdad();
        System.out.println("Edad: " + persona4.getEdad());*/



    }
}
