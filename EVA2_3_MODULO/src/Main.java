import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el número a evaluar: ");
        int v1 = input.nextInt();
        int r = v1%2;

        if (r == 0){
            System.out.println("El valor es par.");
        }
        else
            System.out.println("El valor es impar.");

    }
}