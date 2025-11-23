import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Dame un numero y te devuelvo su doble");
        int numero = myObj.nextInt();

        int resultado = multiplicar(numero);

        System.out.println("El doble de "+numero+" es: "+resultado);
    }

    public static int multiplicar(int pNumero){
        int multiplicacion = pNumero*2;
        return multiplicacion;
    }
}
