import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sumCalifa = 0; /*
        cero es el neutro aditivo
        uno es el neutro multiplicativo
        */

        System.out.println("Introduce el número de calificaciones: ");
        int nCalifa = in.nextInt();



        for (int i = 1; i <= nCalifa; i++) {
            System.out.println("Introduce calificaciones: ");
            int califa = in.nextInt();

            sumCalifa += califa;
        }
        double mean = sumCalifa/nCalifa*1.0;
        System.out.println("Promedio es: " + mean);
    }
}