package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {
        int rows = 3;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        System.out.print("*");
        System.out.println();
        System.out.print("*");
        System.out.print("*");
        System.out.println();
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();
         */
    }
}
