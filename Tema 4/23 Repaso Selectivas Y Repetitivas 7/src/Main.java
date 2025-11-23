import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        boolean continuar = true;
        int iteraciones = 0;
        int suma = 0;

        while (continuar) {
            System.out.println("Dame un numero");
            int numero = datos.nextInt();

            suma = suma + numero;
            iteraciones++;

            if (numero < 0) {
                continuar = false;
                suma = suma - numero;
                iteraciones--;
            }
        }

        int resultado = suma / iteraciones;

        System.out.println("La media de los numeros positivos introducidos : " + resultado);
    }
}
