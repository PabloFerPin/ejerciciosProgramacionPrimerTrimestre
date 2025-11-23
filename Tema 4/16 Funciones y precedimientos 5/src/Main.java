import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.println("Dame un numero y te digo su tabla de multiplicar del 10");
        int num1 = datos.nextInt();

        tabla(num1);
    }

    public static void tabla(int pNum1) {
        for (int x = 1; x <= 10; x++) {
            int resultado = pNum1 * x;

            System.out.println(pNum1 + "x" + x + "=" + resultado);
        }
    }
}
