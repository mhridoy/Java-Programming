package February;

import java.util.Arrays;
import java.util.Scanner;

public class CostCutting_URI {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int testcase = in.nextInt();
            for (int i = 1; i <= testcase; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                int[] arr = {a, b, c};
                Arrays.sort(arr);
                int min = arr[0];
                int max = arr[arr.length - 1];
                int mid = arr[arr.length / 2];

                System.out.println("Case "+i+": "+mid);
            }

        }
    }


