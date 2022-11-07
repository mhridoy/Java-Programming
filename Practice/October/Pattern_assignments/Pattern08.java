package October.Pattern_assignments;

public class Pattern08 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }


            for (int l = 1; l <=i ; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
