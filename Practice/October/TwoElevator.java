package October;

import java.util.Scanner;

public class TwoElevator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
//        while (testCase--!=0){
//
//        }
        for (int i = 0; i <testCase ; i++) {
            //First Elevator
            int a = in.nextInt(); // 10th floor to 1st floor
            // Second Elevator
            int b = in.nextInt();
            int c = in.nextInt(); // b floor  to c floor to 1st floor

            int FirstElevatorTime = (a-1);
            int SecondElevatorTime = Math.abs(b-c)+(c-1);

            if(FirstElevatorTime<SecondElevatorTime){
                System.out.println("1");
            }
            else if( FirstElevatorTime== SecondElevatorTime)
                System.out.println("3");
            else
                System.out.println("2");

        }
    }
}
