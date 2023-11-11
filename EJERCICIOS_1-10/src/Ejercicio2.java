import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num1 = in.nextInt();
        System.out.println("Introduce otro número");
        int num2 = in.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1; i <= num2 ; i++) {
            if (i%2 != 0)
                continue;
            System.out.println(i + " ");
        }
    }
}