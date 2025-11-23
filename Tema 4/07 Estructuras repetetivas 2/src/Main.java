import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Dame un numero y te digo su factorial");
        int numero = myObj.nextInt();
        int suma = 1;

        for (int x=1; x<=numero; x++) {
            suma=suma*x;
        }

        System.out.println("El resulatdo es: " + suma);
    }
}