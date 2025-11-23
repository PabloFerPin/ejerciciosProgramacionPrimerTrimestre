import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);

        int contador = 0;

        for (int x = 1; x <= 10; x++) {
            System.out.println("Dame un numero");
            int numero = date.nextInt();

            if (numero < 0) {
                contador++;
            }
        }

        System.out.println("Has introducido " + contador + " numeros negativos");
    }
}
