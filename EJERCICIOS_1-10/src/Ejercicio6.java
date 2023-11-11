import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        do {
            System.out.println("numero entero positivo: ");
            num = in.nextInt();

            if (num < 0)
                System.out.println("ingresa el dato correcto");
        } while (num < 0);
            String bin = Integer.toBinaryString(num);
            System.out.println(bin);

    }
}