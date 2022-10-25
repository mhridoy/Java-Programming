package October.Pattern_assignments;

import java.util.Scanner;

public class ButterflyPattern_digit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int row = in.nextInt();

        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print( j);
            }
            for (int j = 1; j <=2*(row-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print( j);
            }
            System.out.println();
        }
    }
}
