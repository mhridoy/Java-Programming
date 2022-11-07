package October.w3resource;

import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num, minNumber, maxNumber;

        minNumber = in.nextInt();
        maxNumber = in.nextInt();
        System.out.print("The Perfect numbers within the given range : ");
        for (num = minNumber; num <= maxNumber; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0)
                    sum = sum + i;
            }

            if (sum == num)
                System.out.print(num + " ");

        }

    }
}
