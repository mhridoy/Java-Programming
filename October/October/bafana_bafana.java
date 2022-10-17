package October;

import java.util.Scanner;
public class bafana_bafana {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();

        for (int i = 1; i <=testCase; i++) {
            int Players = in.nextInt();
            int startPoint = in.nextInt();
            int passess = in.nextInt();

            int total = startPoint + passess; 
            int result = total%Players;

            if(result==0)
                System.out.println("Case " + i+ ": " + Players);
            else  
                System.out.println("Case " + i+ ": " + Math.abs(result));

        }
    }
}