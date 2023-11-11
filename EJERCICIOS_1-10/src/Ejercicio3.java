import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = 0;

        System.out.println("Introduce un número");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            total+=i;
            System.out.println(total);
        }
    }
}
