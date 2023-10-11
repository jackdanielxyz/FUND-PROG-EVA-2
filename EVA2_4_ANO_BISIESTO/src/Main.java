import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introcuce el año");
        int year = input.nextByte();

        int x = year % 4;

        if (x==0){
            x = year % 100;
            if (x != 0){
                System.out.println("Es bisiesto");
            }else{
                x = year % 400;
                if (x==0){
                    System.out.println("Es bisiesto");
                }else
                    System.out.println("No es bisiesto");
            }

        }else
            System.out.println("No es bisiesto");
    }
}