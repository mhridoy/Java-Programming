package November;

import java.util.Scanner;

public class mediumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();

        for (int i = 0; i < testCase; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

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
