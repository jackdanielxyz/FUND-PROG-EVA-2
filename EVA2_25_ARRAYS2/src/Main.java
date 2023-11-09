import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Califas a introducir: ");
        int c = in.nextInt();
        int[] arGr = new int[c];

        for (int i = 0; i < c; i++) {
            System.out.println("Intro califa");
            arGr[i] = in.nextInt();
        }

        for (int i = 0; i < c; i++) {
            System.out.println(arGr[i]);
        }tt
    }
}