package November;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && a > c)
            System.out.println(a + " max");
        if (b > a && b > c)
            System.out.println(b + " max");
        if (c > a && c > b)
            System.out.println(c + " max");

        if (a < b && a < c)
            System.out.println(a + " min");
        if (b < a && b < c)
            System.out.println(b + " min");
        if (c < a && c < b)
            System.out.println(c + " min");

    }
}
