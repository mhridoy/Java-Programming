package November.Array;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortReverseOrder {
    public static void main(String[] args) {
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}
