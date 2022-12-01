package CodeForces;

import java.util.Scanner;

public class mediumNumber_threeWays {

   //Method #1
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();

        for (int i = 0; i < testCase; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if (b > a && b < c)
                System.out.println(b);
            else if (b < a && b > c)
                System.out.println(b);

            else if (a > b && a < c)
                System.out.println(a);
            else if (a < b && a > c)
                System.out.println(a);

            else if (c > a && c < b)
                System.out.println(c);
            else if (c < a && c > b)
                System.out.println(c);
        }
    }
}
//Method #2
/*Scanner in = new Scanner(System.in);
        int[] number = new int[3];
        int testCase = in.nextInt();

        for (int i = 0; i < testCase; i++) {
            number[0] = in.nextInt();
            number[1] = in.nextInt();
            number[2] = in.nextInt();

            Arrays.sort(number);
            System.out.println(number[1]);*/

//Method #3
/*Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {

            array[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(array));
        int midPosition = array.length / 2;
        System.out.println(midPosition);
        int midNumber = array[array.length / 2];

        Arrays.sort(array);
        int max = array[array.length - 1];
        int min = array[0];

        System.out.println("Minimum number is = " + min);
        System.out.println("Medium number is = " + midNumber);
        System.out.println("Maximum number is = " + max); */