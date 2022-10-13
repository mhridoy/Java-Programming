package October;

import java.util.Scanner;

public class BinarySearchPractice {

    static int binarySearch(int array[], int lengthArray, int target) {
        int start = 0;
        int end = lengthArray - 1;

        while (start <= end) {
            int mid_position = (start + end) / 2;

            if (array[mid_position] == target)
                return mid_position;

            else if (array[mid_position] > target)
                end = mid_position - 1;
            else {
                start = mid_position + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int array[]={10,20,30,40,50,60,70,80,90};
        int target = in.nextInt();
        int position = binarySearch(array,array.length,target);

        if(position==-1)
            System.out.println("Not Found");
        else {
            System.out.println("Founf in :" + position);
        }

    }

}
