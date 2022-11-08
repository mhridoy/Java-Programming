package November;

import java.util.Scanner;

public class armstrongLoop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        int sum = 0;

        for (int i = num; i > 0; i--) { //153>0,15>0,1>0,0>0 end
            int rem = num % 10; //153%10=3  \15%10=5  ,1%10=1
            sum = sum + (rem * rem * rem);//27+125+1
            num = num / 10;//153/10=15, 15/10=1, 1/10=0

        }
        if (temp == sum)
            System.out.println(temp + " is armstrong number");
        else
            System.out.println(temp + " is not armstrong number");

    }
}
