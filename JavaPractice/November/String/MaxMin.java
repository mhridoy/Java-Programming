package November.String;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a  = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a>b){
            System.out.println(a+" max");}
        else
            System.out.println(b+" max");

        if(a<b)
            System.out.println(a+" min");
        else
            System.out.println(b+" min");

    }
}
