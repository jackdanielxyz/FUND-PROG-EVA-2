public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] += 10000;
        }
        for (int i = 0; i < 10000000; i++) {
            System.out.println(array[i]);
        }
    }
}