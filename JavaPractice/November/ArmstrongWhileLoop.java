package November;

import java.util.Scanner;

public class ArmstrongWhileLoop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int vf1 = num / 10;
            int rem = num % 10;
            num = vf1;
            sum = sum + (rem * rem * rem);

        }

        if (temp == sum)
            System.out.println(temp + " is armstrong number.");
        else
            System.out.println(temp + " is not armstrong number.");
    }
}
