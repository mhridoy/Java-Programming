package March;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbers {
    public static void findMissingNumbers(int[] arr) {
        int totalNumbers = 100;
        List<Integer> missingNumbers = new ArrayList<Integer>();

        // Check each number from 1 to 100
        for (int i = 1; i <= totalNumbers; i++) {
            boolean found = false;

            // Check if the number is present in the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            // Add the missing number to the list
            if (!found) {
                missingNumbers.add(i);
            }
        }

        // Print the missing numbers
        if (missingNumbers.size() > 0) {
            System.out.print("Missing numbers: ");
            for (int i = 0; i < missingNumbers.size(); i++) {
                System.out.print(missingNumbers.get(i) + " ");
            }
        } else {
            System.out.println("No missing numbers found!");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 7,9, 10, 11, 13, 14, 16, 17, 18, 19, 20, 20,21, 22, 24, 25, 27, 29, 30, 31, 32, 33, 34, 36, 38, 39, 40, 42, 43, 44, 45, 46, 47, 49, 50, 51, 52, 54, 55, 56, 57, 59, 60, 62, 63, 64, 66, 67, 68, 69, 70, 71, 72, 73, 75, 76, 77, 78, 79, 80, 81, 83, 85, 86, 88, 90, 91, 93, 94, 95, 96, 97, 99, 100};
        findMissingNumbers(arr);
    }
}
