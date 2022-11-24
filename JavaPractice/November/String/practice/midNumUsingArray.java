package November.String.practice;

import java.util.Scanner;

public class midNumUsingArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] number = new int[3];
        int testCase = in.nextInt();

        for (int i = 0; i < testCase; i++) {
            number[0] = in.nextInt();
            number[1] = in.nextInt();
            number[2] = in.nextInt();

            int a = number[0];
            int b = number[1];
            int c = number[2];


            if (b > a && b < c)
                System.out.println(b);
            else if (b < a && b > c)
                System.out.println(b);

            else if (a > b && a < c)
                System.out.println(a);
            else if (a < b && a > c)
                System.out.println(a);

            else if (c > a && c < b)
                System.out.println(c);
            else if (c < a && c > b)
                System.out.println(c);
        }
    }
}
