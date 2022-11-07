package October.Pattern_assignments;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        // int col = in.nextInt();

        for (int i = 1; i <=row; i++) {
            /*
           when i =1,  j<=i => 1<=1
             */
            // Left Side
            for (int j = 1; j <=i ; j++) {
                System.out.printf("*");
            }
            // Space
            for (int j = 1; j <=2*(row-i) ; j++) {
                System.out.printf(" ");
            }
            // Right Side
            for (int j = 1; j <=i ; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
