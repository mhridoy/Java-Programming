package October.w3resource;

import java.util.Scanner;

public class p06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        //n=15

        for (int i = n; i <=n ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+" X "+j+" = " +i*j);

            }

        }
    }
}
