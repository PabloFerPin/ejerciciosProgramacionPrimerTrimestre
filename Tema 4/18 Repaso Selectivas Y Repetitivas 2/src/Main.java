import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);

        double resultado = 0;

        for (int x = 1; x <= 5; x++) {
            System.out.println("Dame la nota");
            double nota = date.nextInt();

            resultado = resultado + nota;
        }

        double media = resultado / 5;

        System.out.println("La media de las 5 nota es: " + media);
    }
}
