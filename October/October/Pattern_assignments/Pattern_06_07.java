package October.Pattern_assignments;

import java.util.Scanner;

public class Pattern_06_07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = col - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = col - 1; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

