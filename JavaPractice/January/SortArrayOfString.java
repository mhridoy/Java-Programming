package January;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayOfString {

    // Main driver method
    public static void main(String[] args)
    {
        // Custom input string
        String arr[] = { "practice","try", "again" };

        // Sorts arr[] in ascending order
        Arrays.sort(arr);
        System.out.println("Modified arr[] ascending order : "
               + Arrays.toString(arr));

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());


        // printing the above array
        System.out.println("Modified arr[] descending order :"
                + Arrays.toString(arr));
    }
}
