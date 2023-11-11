import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean checker = true;

        while (checker) {
            System.out.println("enter num:");
            int num = in.nextInt();

            numIDfier(num);

            System.out.println("1 para continuar / otro numero para salir");
            int yesNo = in.nextInt();
            if (yesNo != 1)
                checker = false;
        }
    }

    public static void numIDfier(int num) {
        if (num == 0) {
            System.out.println("Numero es cero.");
        } else if (num < 0) {
            System.out.println("Numero es negativo");
        } else if (num > 0) {
            System.out.println("Numero es positivo");
        }
    }
}
