import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int v1=input.nextInt();
        System.out.println("Valor 2: ");
        int v2=input.nextInt();

        if (v1>v2)
            System.out.println("El valor más grande es el " + v1);
        else {
            if (v1 == v2)
                System.out.println("Ambos valores son iguales");
            else{
                System.out.println("El valor mas pequeño es: " + v1);
            }

        }


    }
}