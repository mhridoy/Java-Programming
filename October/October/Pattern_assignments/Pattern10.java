package October.Pattern_assignments;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter row value");

        int row = in.nextInt();;

        for (int i = 1; i <=row ; i++) {
            for (int j = row; j >=i ; j--) {
                System.out.print(" ");}
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
