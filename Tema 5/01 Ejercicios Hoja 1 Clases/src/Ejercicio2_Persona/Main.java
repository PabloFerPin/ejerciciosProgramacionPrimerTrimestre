package Ejercicio2_Persona;

public class Main {
    public static void main(String[] args) {
        Persona objPersona1 = new Persona("Alfredo", 24);
        Persona objPersona2 = new Persona("Juan", 16);

        objPersona1.setEdad(12);
        boolean resultadoFuncionObj1 = objPersona1.esMayorDeEdad();
        objPersona1.mostrarInformacion();
        if (resultadoFuncionObj1 == true) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }
}