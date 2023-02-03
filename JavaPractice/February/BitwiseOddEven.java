package February;

import java.util.Scanner;

public class BitwiseOddEven {
    public static String check(int start, int end) {
        String temp = "";
        for (int i = start; i <= end; i++) {

            if ((i & 1) == 0) {
                temp = temp + "even > " + i + "\n";
            } else {
                temp = temp + "odd  > " + i + "\n";
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int start = input.nextInt();
        int end = input.nextInt();

        System.out.println(check(start, end));

    }
}


