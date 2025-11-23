import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);

        int contador = 0;

        do {
            System.out.println("Dame caracteres");
            String caracter = myObj.nextLine();

            switch (caracter) {
                case "a":
                    System.out.println("Vocal");
                    break;
                case "e":
                    System.out.println("Vocal");
                    break;
                case "i":
                    System.out.println("Vocal");
                    break;
                case "o":
                    System.out.println("Vocal");
                    break;
                case "u":
                    System.out.println("Vocal");
                    break;
                default:
                    System.out.println("Consonante");
                    break;
            }

            if (caracter.equals(" ")) {
                contador++;
            }
        }
        while (contador==0);
    }
}
