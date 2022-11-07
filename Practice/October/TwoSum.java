package October;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            int array[] = {10, 20, 30, 40};
            int targetSum = in.nextInt();
            int result[] = twoSum(array, targetSum);

            for (int i : result) {
                System.out.println(i);
            }
        }
    }

    public static int[] twoSum(int array[], int targetSum) {
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
