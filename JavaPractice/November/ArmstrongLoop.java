package November;

import java.util.Scanner;

public class ArmstrongLoop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        int sum = 0;

        for (; num > 0; ) { //153>0,15>0,1>0,0>0 end
            int rem = num % 10; //153%10=3  \15%10=5  ,1%10=1
           // System.out.println(rem);
            sum = sum + (rem * rem * rem);//27+125+1
            num = num / 10;//153/10=15, 15/10=1, 1/10=0
            //System.out.println(i);
        }

        if (temp == sum)
            System.out.println(temp + " is armstrong number");
        else
            System.out.println(temp + " is not armstrong number");

    }
}
