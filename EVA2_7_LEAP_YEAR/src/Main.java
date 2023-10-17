import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introcuce el año");
        int year = input.nextInt();

        int x4 = year % 4, x100 = year%100, x400=year%400;

        if ((x4 == 0) && ((x100 != 0) || (x400 == 0))){
            System.out.println("Es bisiesto");
        }else
            System.out.println("No es bisiesto");
    }
}
