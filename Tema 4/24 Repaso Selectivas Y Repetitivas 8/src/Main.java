import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.println("Dame un numero y te digo si es primo");
        int numero = datos.nextInt();

        boolean primo = true;

        for (int x = 2; x <= numero / 2; x++) {
            if (numero % x == 0 && x != numero) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println("Primo");
        } else {
            System.out.println("No Primo");
        }
    }
}