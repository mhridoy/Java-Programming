package November;

import java.util.Arrays;
import java.util.Scanner;

public class midNumUsingArraySort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] number = new int[7];
        int testCase = in.nextInt();

        for (int i = 0; i < testCase; i++) {
            number[0] = in.nextInt();
            number[1] = in.nextInt();
            number[2] = in.nextInt();
            number[3] = in.nextInt();
            number[4] = in.nextInt();
            number[5] = in.nextInt();
            number[6] = in.nextInt();

            Arrays.sort(number);
            System.out.println(number[3]);

        }
    }
}
