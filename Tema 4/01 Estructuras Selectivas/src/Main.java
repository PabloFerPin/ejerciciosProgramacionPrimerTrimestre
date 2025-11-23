import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero = myObj.nextInt();

        if (numero > 100) {
            System.out.println("El numero es grande");
        }
        else  {
            System.out.println("El numero es pequeño");
        }
    }
}
