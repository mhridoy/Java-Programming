package October.w3resource;

import java.util.Scanner;

public class p03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Test Data : ");
        int n = in.nextInt();
        int sum=0;
        System.out.print("The first 7 natural number is : ");
        for (int i = 1; i <=n ; i++) {

            sum=sum+i;
            System.out.print(i+" ");}

       System.out.println("\n");
        System.out.print("The Sum of Natural Number upto 7 terms : "+ sum);
    }

    }
