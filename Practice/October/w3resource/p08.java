package October.w3resource;

import java.util.Scanner;

public class p08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter input");
        int n = in.nextInt();
        System.out.println("The odd numbers are : ");
        for (int i = 1; i <= 2 * n; i++) {

            if (i % 2 != 0) {
                System.out.println(i + ": " + "odd");
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
