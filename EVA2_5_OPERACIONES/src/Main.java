import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int v1, v2, res;

        /*
        OPERADOR +
        SUMA
        CONCATENAR ES UNIR CADENAS DE TEXTO
         */
        v1=15;
        v2=7;
        res=v1+v2;

        System.out.println("Suma:");
        System.out.println("Var1 = " + v1);
        System.out.println("Var2 = " + v2);
        System.out.println("Var1 + Var2 = " + res);

        /*
        OPERADOR -
        RESTA
         */
        res=v1-v2;

        System.out.println("\nResta:");
        System.out.println("Var1 = " + v1);
        System.out.println("Var2 = " + v2);
        System.out.println("Var1 - Var2 = " + res);

        /*
        OPERADOR *
        MULTIPLICACIÓN
         */
        res=v1*v2;

        System.out.println("\nMultplicación:");
        System.out.println("Var1 = " + v1);
        System.out.println("Var2 = " + v2);
        System.out.println("Var1 * Var2 = " + res);

        /*
        OPERADOR /
        DIVISIÓN
         */
        res=v1/v2;

        System.out.println("\nDivisión");
        System.out.println("Var1 = " + v1);
        System.out.println("Var2 = " + v2);
        System.out.println("Var1 / Var2 = " + res);

        /*
        OPERADOR /
        DIVISIÓN (Exacta)
         */
        double v1Ex, v2Ex;
        v1Ex=15;
        v2Ex=7;
        double rEx=v1Ex/v2Ex;

        System.out.println("\nDivisión Exacta");
        System.out.println("Var1 = " + v1Ex);
        System.out.println("Var2 = " + v2Ex);
        System.out.println("Var1 / Var2 = " + rEx);

        /*
        PRECEDENCIA DE OPERACIONES
         */
        int a=5, b=3, c=2;
        int resu = (a*b)+(a-c)*(b-a);
        System.out.println("RESULTADO PRECEDENCIA: " + resu);

        /*
        POTENCIAS Y RAICES
         */
        double power=Math.pow(100, 4);
        System.out.println("POTENCIA: " + power);
    }
}