import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);

        int azar = (int) (Math.random() * 50) + 1;
        System.out.println(azar);
        int contador1 = 1;
        int iteraciones = 0;

        while(contador1<=6){
            System.out.println("Dame un numero");
            int numero = myObj.nextInt();
            iteraciones++;
            contador1++;

            if(numero==azar){
                System.out.println("Has ganado en "+iteraciones+" intentos");
                contador1=7;
            }
            else{
                if(numero>azar){
                    System.out.println("Es mayor que el numero aleatorio");
                }
                else {
                    System.out.println("Es menor que el numero aleatorio");
                }
            }

            if (iteraciones==6){
                System.out.println("Intentos agotados");
            }
        }
    }
}
