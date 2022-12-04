package November;

import java.util.Scanner;

public class largestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numOne= in.nextInt();
        int numTwo= in.nextInt();
        int numThree= in.nextInt();

         //Method01
        int largest = numOne>numTwo?numOne:numTwo;
        int largest2= numThree>largest?numThree:largest;

        System.out.println("Largest number is = " + largest2);

        //Method 02
       /* if(numOne>numTwo && numOne>numThree){
            System.out.println("Largest number is = " + numOne);
        }
        if(numTwo>numOne && numTwo>numThree){
            System.out.println("Largest number is = " + numTwo);

    }
            if(numThree>numOne && numThree>numTwo){
            System.out.println("Largest number is = " + numThree);
        }*/

    }
}
