package November.Array;

import java.util.Arrays;
import java.util.Scanner;

public class minMaxMidValueInArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {

            array[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(array));
        int mid = array.length / 2;
        System.out.println(mid);
        int midNumber = array[array.length / 2];

        Arrays.sort(array);
        int max = array[array.length - 1];
        int min = array[0];

        System.out.println("Minimum number is = " + min);
        System.out.println("Medium number is = " + midNumber);
        System.out.println("Maximum number is = " + max);
    }
}