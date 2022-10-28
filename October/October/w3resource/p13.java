package October.w3resource;

import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int row = in.nextInt();
        int count = 0;
        for (int i = 1; i <=row ; i++) {
            for (int j = row-1; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
