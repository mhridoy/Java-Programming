package October.w3resource;

import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i,n;
        float x,sum,t,d ;

        System.out.println("Input the Value of x : ");
        x= in.nextFloat();

        System.out.println("Input the number of terms : ");
         n = in.nextInt();

         sum=1;
         t=1;
        for (i=1;i<n;i++)
        {
            d = (2*i)*(2*i-1);
            t = -t*x*x/d;
            sum =sum+ t;
        }
        System.out.println("Value : "+x+""+"\n"+"Terms : "+n+"\n"+"Sum :" + sum);
    }


}
