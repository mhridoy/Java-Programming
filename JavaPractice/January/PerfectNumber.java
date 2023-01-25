package January;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int num = 27;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("It's a Perfect Number");
        } else {
            System.out.println("It's not a Perfect Number");
        }
    }
}
