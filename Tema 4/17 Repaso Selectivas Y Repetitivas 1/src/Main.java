import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);

        System.out.println("Dame un numero");
        int numero = date.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
