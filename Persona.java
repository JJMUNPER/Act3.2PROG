package org.Ejercicios.ejercicio2tema3;

    public class Persona {


        private String nombre;
        private String primerApellido;
        private String segundoApellido;
        private Integer edad;

        Persona(){
            nombre = "anonimo";
            primerApellido = "Desconocido";
            segundoApellido = "Panchi";
            edad = 32;
        }

        Persona(String nombre, String primerApellido){
            this.nombre = nombre;
            this.primerApellido = primerApellido;

        }

        Persona(String nombre, String primerApellido, String segundoApellido){

            this.nombre = nombre;
            this.primerApellido = primerApellido;
            this.segundoApellido = segundoApellido;


        }

        Persona (String nombre, String primerApellido, String segundoApellido, Integer edad){

            this.nombre = nombre;
            this.primerApellido = primerApellido;
            this.segundoApellido = segundoApellido;
            this.edad = edad;

        }


        public void calculoEdad (){

            if (edad>= 18){
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("No es mayor de edad");
            }

        }

        /** Metodo para que muestre nombre completo*/

        public void nombreCompleto(){
            System.out.println(nombre + " " + primerApellido + " " + segundoApellido);
        }

        /** Creamos un metodo nuevo, para que muestre las iniciales*/

        public void printPrimerIncial(){
            System.out.println(" " + this.nombre.charAt(0) + " " + this.primerApellido.charAt(0) + " " + this.segundoApellido.charAt(0));
        }

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre=nombre;

        }

        public String getPrimerApellido(){
            return primerApellido;
        }


        public void setPrimerApellido(String primerApellido){
            this.primerApellido=primerApellido;
        }

        public Integer getEdad(){
            return edad;
        }
        public void setEdad(Integer edad){
            this.edad=edad;
        }

        public String getSegundoApellido(){
            return segundoApellido;
        }
        public void setSegundoApellido(){
            this.segundoApellido=segundoApellido;
        }
    }


