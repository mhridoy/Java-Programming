package October;

import java.util.Scanner;

public class NumbersCounting{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array [] = {10,10,10,4,3,5,6};
        int target = in.nextInt();

        int count=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]==target) 
            count= count+1;
        }
        System.out.println(count);
        
    }
}