public class Main {
    public static void main(String[] args) {
        /*
        for cuando sabes el numero de repeticiones
        do
        do while

        ++ agrega 1
        -- resta 1
        += aumenta N
        -+ resta N
        *= multiplica N
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 9; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = 0; i < 102; i += 2) {
            System.out.print(i + "-");
        }
    }
}