import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.println("Dame un numero");
        int numero = datos.nextInt();

        boolean resultado = comprobar(numero);

        if (resultado == true) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

    public static boolean comprobar(int fNumero) {
        boolean estado;

        if (fNumero % 2 == 0) {
            estado = true;
        } else {
            estado = false;
        }

        return estado;
    }
}
