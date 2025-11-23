package Ejercicio11_Automovil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la marca: ");
        String marca = datos.nextLine();
        System.out.println("Nº de modelo: ");
        int modelo = datos.nextInt();
        System.out.println("Volumen en litros de la cilindrada del motor del automóvil.: ");
        double motor = datos.nextDouble();
        System.out.println("Cantidad de puertas: ");
        int cantidadPuertas = datos.nextInt();
        System.out.println("Cantidad asientos: ");
        int cantidadAsientos = datos.nextInt();
        System.out.println("Velocidad Maxima: ");
        double velocidadMaxima = datos.nextDouble();
        System.out.println("Velocidad Actual: ");
        double velocidadActual = datos.nextDouble();

        Automovil objAutomovil = new Automovil(marca, modelo, motor, cantidadPuertas, cantidadAsientos, velocidadMaxima, velocidadActual);
        objAutomovil.mostrarInfo();
        System.out.println(" ");

        objAutomovil.acelerar(20);
        objAutomovil.mostrarInfo();
        System.out.println(" ");

        objAutomovil.desacelerar(50);
        objAutomovil.mostrarInfo();
        System.out.println(" ");

        objAutomovil.frenar();
        objAutomovil.mostrarInfo();
        System.out.println(" ");

        objAutomovil.acelerar(20);
        objAutomovil.calcularTiempoEstimado(1250);
    }
}
