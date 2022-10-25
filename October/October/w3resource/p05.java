package October.w3resource;

import java.util.Scanner;

public class p05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=i ; j++) {
                System.out.println("Number is : "+i+ " and cube of the " +i+ " is"+" : "+i*j*j);
            }
        }
    }
}
