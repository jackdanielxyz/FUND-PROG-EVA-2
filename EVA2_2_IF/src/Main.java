import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu califa: ");
        int califa = input.nextInt();

        if (califa >= 70){
            System.out.println("APROBADO");
        }else {
            System.out.println("REPROBADO");
        }
    }
}