import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce talla: ");
        int talla = in.nextInt();

        switch (talla){
            case 29:
                System.out.println("Small");
                break;
            case 42:
                System.out.println("Medium");
                break;
            case 44:
                System.out.println("Large");
                break;
            case 48:
                System.out.println("XLarge");
            default:
                System.out.println("Valor no válido.");
        }
    }
}