import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 1;

        System.out.println("numero base");
        int base = in.nextInt();
        System.out.println("numero exponente");
        int pow = in.nextInt();

        for (int i = 0; i < pow; i++) {
            total *= base;
        }
        System.out.println(total);
    }
}
