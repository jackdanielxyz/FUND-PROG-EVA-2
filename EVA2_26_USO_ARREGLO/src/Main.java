import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] dish = new String[10];
        int opc, cant;

        dish[0] = "tacos";
        dish[1] = "tacos de yakult";
        dish[2] = "tlacoyo";
        dish[3] = "tamales";
        dish[4] = "tortas";
        dish[5] = "frijolitos";
        dish[6] = "cheetos";
        dish[7] = "quesipizza";
        dish[8] = "burritos arizona";
        dish[9] = "agua mineral";
        double[] price = {20, 50, 60, 25, 80, 90, 55, 90, 70, 15};

        System.out.println("es el menu bro");
        for (int i = 0; i < dish.length; i++) {
            System.out.println(i+1 + ".- " + dish[i] + ": $" + price[i]);
        }
        System.out.println("k kiere?");
        opc = in.nextInt();
        System.out.println("y kuantos?");
        cant = in.nextInt();

        System.out.println("debe pagar: " + (cant * price[opc]));

    }
}