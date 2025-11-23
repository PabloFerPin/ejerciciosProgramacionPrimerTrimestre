package Ejercicio7_Persona;

public class Main {
    public static void main(String[] args) {
        Persona objPersona1 = new Persona("Pablo", "Del Bosque", 20202020, 2007);
        Persona objPersona2 = new Persona("Alfredo", "Shulker", 50505050, 600);

        objPersona1.mostrarInformacion();
        System.out.println(" ");
        objPersona2.mostrarInformacion();
    }
}
