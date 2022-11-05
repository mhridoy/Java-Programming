package October;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter a year, 1582 and above : ");

        int year = in.nextInt();

        if (year >= 1582) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                System.out.println(year + " is leap year.");

            else
                System.out.println(year + " is not leap year.");
        }
        else
            System.out.println("Please Enter a year, 1582 and above!");
    }

}
