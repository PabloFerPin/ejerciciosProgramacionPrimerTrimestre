import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner datos = new Scanner(System.in);

        boolean nNotas = true;
        int iteraciones = 0;
        double notaTotal = 0;
        double notaMin = 20;
        double notaMax = 0;

        while (nNotas) {
            System.out.print("Dime la nota: ");
            double nota = datos.nextDouble();
            notaTotal = notaTotal+nota;

            iteraciones++;

            if (iteraciones==30 || nota<0) {
                nNotas = false;
                notaTotal = notaTotal-nota;
                iteraciones--;
            }

            if (nota<notaMin && nota>0) {
                notaMin = nota;
            }

            if (nota>notaMax) {
                notaMax = nota;
            }
        }

        double media = notaTotal/iteraciones;

        System.out.println("La nota media de las introducidas es: "+media);
        System.out.println("La nota mas baja de las introducidas es: "+notaMin);
        System.out.println("La nota mas alta de las introducidas es: "+notaMax);
    }
}
