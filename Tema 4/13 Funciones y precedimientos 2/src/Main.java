import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Dime tu nombre");
        String nombre = myObj.nextLine();

        bienvenido(nombre);
    }

    public static void bienvenido(String pNombre) {
        System.out.println("Hola, "+pNombre+","+" ¡Bienvenido a PSeint!.");
    }
}
