package October.w3resource;
//problem

import java.util.Scanner;

public class p04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        float avg =0;
        System.out.println("Input the 10 numbers : ");

        for (int i = 1; i <= 10; i++) {

            int n = in.nextInt();

            System.out.println("Number - "+ i+" : "+ n);
            sum = sum+n;
            avg = (float)sum/10;

          //  System.out.println(sum);
          //  System.out.println(avg);
        }
      //avg = sum/10;
        System.out.println("The sum of 10 numbers are : "+ sum);
        System.out.println("The Average is : " + avg);
    }
}
//8,12,16,17,18,19,21