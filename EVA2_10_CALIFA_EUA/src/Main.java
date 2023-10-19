import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce califa: ");
        int califa = in.nextInt();

        if ((califa <= 100) && (califa >=90))
            System.out.println("A");
        else if ((califa <= 89) && (califa >=80))
            System.out.println("B");
        else if ((califa <= 79) && (califa >=70))
            System.out.println("C");
        else if ((califa <= 69) && (califa >=60))
            System.out.println("D");
        else
            System.out.println("F");
    }
}