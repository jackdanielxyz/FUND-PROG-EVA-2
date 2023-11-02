import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cuenta = 1000;
        int retiro;

        while(cuenta > 0){

            System.out.println("¿Cuánto desea retirar?");
            retiro = in.nextInt();
            cuenta -= retiro;
            System.out.println("Saldo: " + cuenta);

        }


    }
}