package January;
//Java program to Sort a Subarray in Array
import java.util.Arrays;


public class SortSubarray {
    public static void main(String[] args) {

        int[] arr = {1, 78, 5, 4, 8, 3, 1};

        Arrays.sort(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
    }

}
