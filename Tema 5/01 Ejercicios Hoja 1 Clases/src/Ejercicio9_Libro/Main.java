package Ejercicio9_Libro;

import Ejercicio5_Empleado.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Scanner datos = new Scanner(System.in);

        System.out.println("Ingrese el nombre del libro, el autor y si esta o no devuelto: ");
        String nombre = datos.nextLine();
        String autor = datos.nextLine();
        boolean estado = datos.nextBoolean();

        libro1.setAutor(nombre);
        libro1.setTitulo(autor);
        libro1.setPrestado(estado);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Quieres cambiar el estado del libro?");
            boolean respuesta = datos.nextBoolean();

            if (respuesta == true) {
                System.out.println("Cambiando de estado");
                if (libro1.getPrestado() == true) {
                    libro1.devolver();
                } else {
                    libro1.prestar();
                }
            } else {
                continuar = false;
            }
        }

        libro1.estado();
    }
}
