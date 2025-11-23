import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Dime tu nota");
        int nota = myObj.nextInt();

        switch (nota) {
            case 1,2,3,4:
                System.out.println("Estas suspenso");
                break;
            case 5,6:
                System.out.println("Estas aprovado");
                break;
            case 7,8:
                System.out.println("Tienes un notable");
                break;
            case 9,10:
                System.out.println("Tienes un sobresaliente");
                break;
            default:
                System.out.println("Nota no valida");
                break;
        }
    }
}
