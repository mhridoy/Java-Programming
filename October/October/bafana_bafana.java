package October;

import java.util.Scanner;

public class bafana_bafana {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();

        for (int i = 1; i <=testCase; i++) {
            int Players = in.nextInt(); // 5
            int startPoint = in.nextInt(); //2 
            int passess = in.nextInt(); //10

            int total = startPoint + passess; //12
           int result = total%Players;
            //int temp = Players;
            // while(total>0){
            //     total = total-Players; // 7 2 
            //     if(total<=Players) break;
            // }
            if(result==0)
            System.out.println("Case " + i+ ": " + Players);
            else 
            System.out.println("Case " + i+ ": " + Math.abs(result));
            // if(total>Players  ){

            //     System.out.println("case " + i+ ": " + result);}

            // else if (total == Players)

            //     System.out.println("case " + i+ ": " + Players);
        }
    }
}
