package October;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            //System.out.println(array[i]);
        }
        int searchElement = in.nextInt();
        boolean Check = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {

                System.out.println(searchElement + " Found in positon: " + i);
                Check = true;
            }
        }

        if (Check == false) {
            System.out.println("Not Found");
        }
    }
}

