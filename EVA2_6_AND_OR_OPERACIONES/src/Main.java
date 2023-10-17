import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Califa: ");
        int califa = input.nextInt();

        /*
        VALIDAR
        CALIFA MAYOR O IGUAL A CERO *Y* CALIFA MENOR O IGUAL A 100
         */

        if((califa >= 0) && (califa <= 100)){
            System.out.println("Califa es válida");
            if (califa >= 70) {
                System.out.println("Aprobaste!!");
            }else
                System.out.println("Reprobaste :(");
        }else
            System.out.println("Califa no es válida");
    }
}