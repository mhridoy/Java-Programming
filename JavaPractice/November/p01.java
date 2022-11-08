package November;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Plz. enter num");

        int num= in.nextInt();

        int vf1=num/10;  
        int thirdNum=num%10;

        int vf2=vf1/10;
        int secNum=vf1%10;

        int vf3=vf2/10;
        int FirstNUm=vf2%10;

        int cubeOfthird = thirdNum*thirdNum*thirdNum;
        int cubeOfSec=secNum*secNum*secNum;
        int cubeOfFirst=FirstNUm*FirstNUm*FirstNUm;

        int sumOfCubes=cubeOfthird+cubeOfSec+cubeOfFirst;

        if (num==sumOfCubes){
            System.out.println(num + " Is armstrong number");

        }
        else {
            System.out.println(num + " Is not an armstrong number");

        }









        /*
        int vf1=num/10;
        int eighthNum=num%10;
        System.out.println("Eight number = " + eighthNum);

        int vf2=vf1/10;
        int seventhNum= vf1%10;
        System.out.println("Seventh number =" + seventhNum);

        int vf3= vf2/10;
        int sixthNum=vf2%10;
        System.out.println("SIxth Number =" + sixthNum);

        int vf4=vf3/10;
        int fifthNum=vf3%10;
        System.out.println("Fifth number = " + fifthNum);

        int vf5=vf4/10;
        int fourthNum=vf4%10;
        System.out.println("Fourth Number = " + fourthNum);

        int vf6=vf5/10;
        int thirdNum= vf5%10;
        System.out.println("Third Number =" + thirdNum);

        int vf7=vf6/10;
        int secondNum=vf6%10;
        System.out.println("Second number =" + secondNum);

        int vf8=vf7/10;
        int firstNum=vf7%10;
        System.out.println("First Number = "+firstNum);

        int sum=fifthNum+secondNum+thirdNum+fourthNum+fifthNum+sixthNum+seventhNum+eighthNum;

        System.out.println(sum);


      /*  int vf1=num/10;
        int sixthDigit=num%10;
        System.out.println("sixth Digit = " + sixthDigit);

        int vf2=vf1/10;
        int fifthDigit=vf1%10;
        System.out.println("fifth digit = " + fifthDigit);

        int vf3=vf2/10;
        int fourthDigit =vf2%10;
        System.out.println("Fourth digit = " + fourthDigit);

        int vf4 = vf3/10;
        int thirdDigit =vf3%10;
        System.out.println("Third Digit = " + thirdDigit);

        int vf5 = vf4/10;
        int secondDigit=vf4%10;
        System.out.println("Second Digit = " + secondDigit);

        int vf6=vf5/10;
        int firstDigit=vf5%10;
        System.out.println("First Digit =" + firstDigit);

*/


        }

    }

