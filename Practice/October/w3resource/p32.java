package October.w3resource;

import java.util.Scanner;

public class p32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 13;
        int count = 0;

        for (int i = 2; i < n; i++) {

            if (n % i == 0)
                count++;
            break;

        }
        if (count == 0) {
            System.out.println(n + " is a prime number.");

        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
