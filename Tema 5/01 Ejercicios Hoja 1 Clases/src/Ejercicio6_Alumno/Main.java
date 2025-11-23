package Ejercicio6_Alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Alumno objAlumnno = new Alumno();
        Scanner numero = new Scanner(System.in);
        Scanner datos = new Scanner(System.in);
        Scanner datos2 = new Scanner(System.in);
        Scanner datos3 = new Scanner(System.in);
        Scanner datos4 = new Scanner(System.in);
        Scanner datos5 = new Scanner(System.in);
        Scanner datos6 = new Scanner(System.in);
        Scanner datos7 = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("1: Insertar Alumno");
            System.out.println("2: Modificar Alumno");
            System.out.println("3: Eliminar Alumno");
            System.out.println("4: Calcular media");
            System.out.println("5: Salir");
            int numMenu = numero.nextInt();

            switch (numMenu) {
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    String nombre = datos.nextLine();
                    System.out.println("Ingrese el nombre asignatura: ");
                    String nombreAsignatura = datos2.nextLine();
                    System.out.println("Ingrese la nota parcial1: ");
                    double notaPrimerParcial = datos3.nextDouble();
                    System.out.println("Ingrese la nota parcial2: ");
                    double notaSegundoParcial = datos4.nextDouble();
                    System.out.println("Ingrese la nota de la exposicion: ");
                    double notaExposicion = datos5.nextDouble();
                    System.out.println("Ingrese la nota de los ejercicios: ");
                    double notaEjercicios = datos6.nextDouble();
                    System.out.println("Ingrese la nota del trabajo de clase: ");
                    double notaTrabajo = datos7.nextDouble();

                    objAlumnno.insertarRegistro(nombre, nombreAsignatura, notaPrimerParcial, notaSegundoParcial, notaExposicion, notaEjercicios, notaTrabajo);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre: ");
                    String nombreM = datos.nextLine();
                    System.out.println("Ingrese el nombre asignatura: ");
                    String nombreAsignaturaM = datos2.nextLine();
                    System.out.println("Ingrese la nota parcial1: ");
                    double notaPrimerParcialM = datos3.nextDouble();
                    System.out.println("Ingrese la nota parcial2: ");
                    double notaSegundoParcialM = datos4.nextDouble();
                    System.out.println("Ingrese la nota de la exposicion: ");
                    double notaExposicionM = datos5.nextDouble();
                    System.out.println("Ingrese la nota de los ejercicios: ");
                    double notaEjerciciosM = datos6.nextDouble();
                    System.out.println("Ingrese la nota del trabajo de clase: ");
                    double notaTrabajoM = datos7.nextDouble();

                    objAlumnno.insertarRegistro(nombreM, nombreAsignaturaM, notaPrimerParcialM, notaSegundoParcialM, notaExposicionM, notaEjerciciosM, notaTrabajoM);
                    break;
                case 3:
                    System.out.println("Eliminando alumno");
                    objAlumnno.eliminarRegistro();
                    break;
                case 4:
                    double notaMedia = objAlumnno.calcularNotaPrimeraEvaluacion();
                    System.out.println("La nota media es: "+notaMedia);
                    break;
                default:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
            }
        }
    }
}