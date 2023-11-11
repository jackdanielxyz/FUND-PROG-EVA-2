import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("");
        System.out.println("k buskas?");
        int num = in.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) 
                System.out.println("en " + i);
        }
    }
}