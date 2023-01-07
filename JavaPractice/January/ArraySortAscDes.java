package January;

import java.util.Arrays;

public class ArraySortAscDes {

    public static void main(String[] args) {
        int numbers[] = {4, 9, 5, 2, 7, 6, 3, -1, 0};
        Arrays.sort(numbers);

        //Ascending
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        //Descending
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        //ForEach
        for (int i : numbers)
            System.out.print(i + " ");
    }
}
