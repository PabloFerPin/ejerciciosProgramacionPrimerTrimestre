import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = myObj.nextInt();

        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}
