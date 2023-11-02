import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("introduce el numeor que creas correcto");
            int num = in.nextInt();
            if (num == 0){
                System.out.println("adivinaste");
                break;
            }
        }
    }
}