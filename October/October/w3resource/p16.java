package October.w3resource;

import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of terms : ");
        int n = in.nextInt();
        int sum=0;
        System.out.print( "The even numbers are : ");
        for (int i = 1; i <=2*n ; i++) {

            if(i%2==0){
                System.out.print (i+ " ");
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println("The Sum of even Natural Number upto 5 terms : "+sum);
    }
}
