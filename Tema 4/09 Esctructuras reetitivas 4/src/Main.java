import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Dame un numero y te digo su tabla de multiplicar");
        int numero = myObj.nextInt();

        for(int x=1; x<=10 ; x++){
            int resultado = numero*x;
            System.out.println(numero+"x"+x+"="+resultado);
        }
    }
}
